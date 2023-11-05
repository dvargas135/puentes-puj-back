package com.wiki.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wiki.api.model.song.Song;
import com.wiki.api.model.song.SongRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class SongController {

    @Autowired
    private SongRepository songRepository;

    @GetMapping("/list")
    public String listEntities(Model model) {
        Iterable<Song> entities = songRepository.findAll();
        model.addAttribute("entities", entities);
        return "list";
        //dd
    }

    @CrossOrigin
    @PostMapping(value = "/songs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createSong(@RequestBody Song newSong) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        newSong.setId(null);
        Song savedSong = songRepository.save(newSong);
        return new ResponseEntity<>(savedSong.toJSON().toString(), responseHeaders, HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/songs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAllSongs() throws Exception {
        List<Song> songs = (List<Song>) songRepository.findAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>(Song.toJSONArray(songs).toString(), responseHeaders, HttpStatus.OK);
    }

    // @CrossOrigin
    // @GetMapping(value = "/songs/genre/{genre_id}", produces =
    // MediaType.APPLICATION_JSON_VALUE)
    // public ResponseEntity<String> getAllSongsFromGenre(Long genre_id) throws
    // Exception {
    // List<Song> songs = (List<Song>) songRepository.findByGenre_id(genre_id);
    // HttpHeaders responseHeaders = new HttpHeaders();
    // return new ResponseEntity<String>(Song.toJSONArray(songs).toString(),
    // responseHeaders, HttpStatus.OK);
    // }

    @CrossOrigin
    @GetMapping(value = "/songs/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getSongById(@PathVariable Long id) throws Exception {
        Song song = songRepository.findById(id).orElse(null);
        HttpHeaders responseHeaders = new HttpHeaders();
        if (song != null) {
            return new ResponseEntity<String>(song.toJSON().toString(), responseHeaders, HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Song not found", responseHeaders, HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @PutMapping(value = "/songs/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> updateSong(@PathVariable Long id, @RequestBody Song updatedSong) throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        Optional<Song> optionalSong = songRepository.findById(id);
        if (optionalSong.isPresent()) {
            Song existingSong = optionalSong.get();

            existingSong.setTitle(updatedSong.getTitle());
            existingSong.setDuration(updatedSong.getDuration());
            existingSong.setAlbumid(updatedSong.getAlbumid());
            existingSong.setGenreid(updatedSong.getGenreid());

            Song savedSong = songRepository.save(existingSong);
            return new ResponseEntity<>(savedSong.toJSON().toString(), responseHeaders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Song not found", responseHeaders, HttpStatus.NOT_FOUND);
        }
    }

    @CrossOrigin
    @DeleteMapping(value = "/songs/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> deleteSong(@PathVariable Long id) {
        HttpHeaders responseHeaders = new HttpHeaders();
        Optional<Song> optionalSong = songRepository.findById(id);
        if (optionalSong.isPresent()) {
            songRepository.deleteById(id);
            return new ResponseEntity<>("Song deleted", responseHeaders, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Song not found", responseHeaders, HttpStatus.NOT_FOUND);
        }
    }

}

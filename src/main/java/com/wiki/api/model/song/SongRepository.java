package com.wiki.api.model.song;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SongRepository extends CrudRepository<Song, Long> {
    // List<Song> findByGenre_id(@Param("genre_id") Long genre_id);
}

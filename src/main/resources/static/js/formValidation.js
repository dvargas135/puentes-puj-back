var nameError=document.getElementById('name-error');
var lnamenameError=document.getElementById('lname-error');
var emailError=document.getElementById('email-error');
var messageError=document.getElementById('message-error');
var submitError=document.getElementById('submit-error');

function validate() {
    // validaciones de nombres
    var name=document.getElementById('nombre').value;

    if (name==null || name==""){
        submitError.innerHTML = 'Error: Digite su nombre';
        submitError.style.display = 'inline-block';
        return false;
    }
    if (!name.match(/^[a-zA-Z ]*$/)) {
        submitError.innerHTML = 'Error: Escriba solo letras en el nombre';
        submitError.style.display = 'inline-block';
        return false;
    }
    
    // validaciones de apellidos
    var apellido = document.getElementById('apellido').value;
    if (apellido==null || apellido==""){
        submitError.innerHTML = 'Error: Digite su apellido';
        submitError.style.display = 'inline-block';
        return false;
    }
    if (!apellido.match(/^[a-zA-Z ]*$/)) {
        submitError.innerHTML = 'Error: Escriba solo letras en el apellido';
        submitError.style.display = 'inline-block';
        return false;
    } 

    // validaciones de email
    var email = document.getElementById('email').value;
    if (email==null || email==""){
        submitError.innerHTML = 'Error: Digite su correo electronico';
        submitError.style.display = 'inline-block';
        return false;
    }
    if (!email.match(/^[A-Za-z\._\-[0-9]*[@][A-Za-z]*[\.][a-z]{2,4}$/)) {
        submitError.innerHTML = 'Error: Email invalido';
        submitError.style.display = 'inline-block';
        return false;
    }

    // validacion de mensaje
    var mensaje = document.getElementById('asunto').value;
    if (mensaje==null || mensaje==""){
        submitError.innerHTML = 'Error: Digite un mensaje';
        submitError.style.display = 'inline-block';
        return false;
    }

    submitError.style.backgroundColor = 'transparent';
    submitError.innerHTML='<i class="bx bxs-check-circle"></i>';
    return true;
}

var usuario = "andrew"
var contrasenia = "1234"

//Funciones de index
function mostrarInput(){
    let userInput = document.getElementById("userName").value;
    let userContrasenia = document.getElementById("userPassword").value;
    alert("Usuario: " + userInput + "\nContraseña: " + userContrasenia);
    
}

function check(){
    let userInput = document.getElementById("userName").value;
    let userContrasenia = document.getElementById("userPassword").value;
    if(userInput == "" && userContrasenia == ""){
        alert("FALTAN AMBOS")
        reset();
        close();
    }else if(userInput == "")
    {
        alert("FALTAN USUARIO")
        reset();
        close();
    }else if(userContrasenia == ""){
        alert("FALTAN CONTRASEÑA")
        reset();
        close();
    }else
        login(userInput, userContrasenia);
}

function login(userInput,userContrasenia){
    if(userInput == usuario &&
        userContrasenia == contrasenia){
        alert("INICION SESIADA");
        redirect();
    }else{
        alert("Usuario o contraseña no existen");
    }
    reset();
}

function reset(){
    document.getElementById("userName").value = "";
    document.getElementById("userPassword").value = "";
}

function redirect(){
    //open("login.html");
    location.href= "./login.html";
}

//Funciones de login
function showUsername(){
    document.getElementById("userName").innerText = usuario;
}

function precio(){
    let puertas;        //Variable almacena valor de puerta
    let combustible;    //Variable almacena valor de combustible
    let res;            //Almacena el resultado final
    let imagen = document.getElementById("coche");

    //Si radio de gasolina esta seleccionado se atribuye su valor
    if(document.getElementById("gasolina").checked){
        combustible = document.getElementById("gasolina").value;
    }else if(document.getElementById("diesel").checked)//Sino se le atribuye el de diesel
        combustible = document.getElementById("diesel").value

    //Si radio de 3doors esta seleccionado se atribuye su valor
    if(document.getElementById("3doors").checked){
        puertas = document.getElementById("3doors").value;
    }else if(document.getElementById("5doors").checked)//Sino se le atribuye el de 5doors
        puertas = document.getElementById("5doors").value;

    if(puertas == "3"){
        if(combustible == "g"){
            r = 25000;
            imagen.setAttribute("src", "./img/1.png");
        }else if(combustible == "d"){
            r = 26500;
            imagen.setAttribute("src", "./img/2.png");
        }else
            alert("No has seleccionado combustible");
    }else if(puertas == "5"){
        if(combustible == "g"){
            r = 26500;
            imagen.setAttribute("src", "./img/3.png");
        }else if(combustible == "d"){
            r = 30000;
            imagen.setAttribute("src", "./img/4.png");
        }else
            alert("No has seleccionado combustible");
    }else
        alert("No has seleccionado cantidad de puertas");

    document.getElementById("resultado").innerText = r + "€ con IVA";
}
function ponerImagen()
{
    let pokemon = prompt();
    let imagen = document.getElementById("imagen");
    let route;
    if(pokemon == "jagger")
        route = "./images/" + pokemon + ".gif";
    else
        route = "./images/" + pokemon + ".png";
    //imagen.src = route;
    imagen.setAttribute("src", route);
}
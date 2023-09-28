var flag = 0;

function cambiarImagen()
{
    let imagen = document.getElementById("imagen");
    if(flag == 0)
    {
        imagen.src = "images/"+flag+".png";
        flag++;
    }else
    {
        imagen.src = "images/"+flag+".png";
        flag--;
    }
}

//alert(<img id="imagen" src="images/.png"/>);
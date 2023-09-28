function myAlert(){
    alert("alert");
}

function changeColor(){
    document.getElementById("alarm").style.backgroundColor(0,0,255);
}

document.getElementById("alarm").addEventListener("mouseover", changeColor);
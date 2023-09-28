function ejercicio1(){
    let n = prompt("Ingrese un número");
    alert(n * n);
}

function ejercicio2(){
    let cm = prompt("Ingrese una longitud en cm");
    alert(cm * 2.54 + " pulgadas")
}

function ejercicio3(){
    let p = prompt("Introduce un número");
    let i = parseInt(p);
    let f = parseFloat(p);
    let decimal = f - i;
    alert("Parte entera: " + i + 
            "\nParte decimal: " + decimal);
}
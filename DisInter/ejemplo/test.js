
//Suma dos valores y devuelve el resultado
function sumar(/*n1, n2*/)
{
    let n1 = 2; //numero 1
    let n2 = 5; //numero 2
    return n1 += n2; //Opera primero, devuelve despues
}

//Restar dos valores y devuelve el resultado
function restar(/*n1, n2*/)
{
    let n1 = 6; //numero 1
    let n2 = 5; //numero 2
    return n1 -= n2; //Opera primero, devuelve despues
}

document.write("Suma: " + sumar(/*2, 5*/) + 
"   Restar: " + restar(/*6, 5*/) + "\n");
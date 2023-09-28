let anio = 2400;
let esBisiesto = false;

if(anio % 4 == 0)
    esBisiesto = true;
if(anio % 100 == 0 && anio > 1582)
    esBisiesto = false;
if(anio % 400 == 0)
    esBisiesto = true;
if(esBisiesto)
    console.log(anio + " es bisiesto");
else
    console.log(anio + " no es bisiesto");
let altura = 1.75;
let peso = 72.5;
let res = peso / (altura * altura);

if (res < 18.5) {
    console.log("bajo peso");
} else if (res < 25){
    console.log("normal");
} else if (res < 30){
    console.log("sobrepeso");
} else{
    console.log("obesidad");
}
console.log("Tu resultado es: " + res);
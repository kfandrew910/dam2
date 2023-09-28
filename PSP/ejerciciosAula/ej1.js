
let buffer = "TRWAGMYFPDXBNJZSQVHLCKE";

let sacarDNI = function(n){
	return (buffer[n % 23]);
}

function esDNI(num,letra){
	return (letra == sacarDNI(num))?true:false
}
export function test(){
	let numero = parseInt(Math.random() * 99999999);
	let letra = sacarDNI(numero);
	let dni = numero + letra;

	console.log(dni);

	console.log(esDNI(numero, letra)?"es válido":"no es válido");

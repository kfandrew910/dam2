/*LOS OBJETOS SON MAPAS DISFRAZADOS*/

let obj = {
	nombre: "Calculadora",
	sumar: function(a,b){
		return (a + b);
	},
	restar: function(a,b){
		return (a - b);
	}
}

console.log(obj.nombre);
console.log(obj.sumar(1,2));
console.log(obj.restar(2,1));

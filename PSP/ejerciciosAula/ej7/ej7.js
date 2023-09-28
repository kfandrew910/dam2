var personaBuilder = function(){
	let persona = {
		nombre: "",
		apellido1: "",
		apellido2: ""
	}
	return persona;
}

function apellidosNombre(persona){
	console.log(persona.nombre + "\n" + 
		persona.apellido1 + "\n" + 
		persona.apellido2);
}

var persona1 = personaBuilder();
persona1.nombre = process.argv[2];
//persona2.nombre = "2";

persona1.apellido1 = process.argv[3];
//persona2.apellido1 = "x";

persona1.apellido2 = process.argv[4];
//persona2.apellido2 = "z";

var persona2 = personaBuilder();

apellidosNombre(persona1);
//apellidosNombre(persona2);

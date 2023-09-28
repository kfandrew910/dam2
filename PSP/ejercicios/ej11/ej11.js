var librito = {
	"a":123456789,
	"b":234567891,
	"c":345678912
}

if(process.argv.length == 3)
	console.log((librito[process.argv[2]] != undefined)?
		librito[process.argv[2]]:
		"no existe contacto");

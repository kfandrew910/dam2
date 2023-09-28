//process.argv[];

let a = parseInt(process.argv[3]);
let b;

if(process.argv.length == 4){
	switch(process.argv[2]){
		case "sqrt":
			console.log(Math.sqrt(a));
			break;
		case "cos":
			console.log(Math.cos(a));
			break;
		case "sin":
			console.log(Math.sin(a));
			break;
		case "tan":
			console.log(Math.tan(a));
			break;
		default:
			console.log("Operación no válida");
			break;
	}
}else if(process.argv.length == 5){
		a = parseInt(process.argv[2]);
		b = parseInt(process.argv[4]);

		switch(process.argv[3]){
			case '+':
				console.log(a + b);
				break;
			case '-':
				console.log(a - b);
				break;
			case '*':
				console.log((a * b));
				break;
			case '/':
				console.log(a / b);
				break;
			case '%':
				console.log(a % b);
				break;
			default:
				console.log("operación no válida");
				break;
		}
	}else
	console.log("cantidad de argumentos incorrecta");

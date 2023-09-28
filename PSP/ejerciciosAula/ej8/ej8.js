//process.argv[];

let a = parseInt(process.argv[2]);
let b = parseInt(process.argv[4]);

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
}

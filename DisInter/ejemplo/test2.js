var a = 10;
var b = 0;
var c = a + b++;
document.writeln("Resultado b++: " + c);
c = a + ++b;
document.writeln("Resultado ++b:" + c);
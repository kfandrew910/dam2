var screen = document.getElementById("screen");
var display = "";
var operation = "";

function showDisplay(){
    document.getElementById("screen").style.padding = "11.5px";
    document.getElementById("screen").innerText = display;
}

function operate(n){
    display += n;
    if(n == 'x')
        n = '*';
    operation += n;
    showDisplay(); 
}

function solve(){
    let solution = eval(operation);
    display += " = " + solution;
    showDisplay();
}

function reset(){
    display = "";
    operation = ""
    showDisplay()
    document.getElementById("screen").style.padding = "20px";
}
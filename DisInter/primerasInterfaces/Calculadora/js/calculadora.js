var text = "";
var operation = "";

function insert(num) {
    text += num;
    if(num == 'x')
        num = '*';
    operation += num;
    showText();
}

function showText() {
    document.getElementById("screen").style.padding = "5.5px";
    document.getElementById("screen").innerText = text;
}

function resolve() {
    r = eval(operation);
    document.getElementById("screen").innerText = text + "=" + r;
}

function reset(){
    text = "";
    operation = "";
    showText();
    document.getElementById("screen").style.padding = "20px";
}
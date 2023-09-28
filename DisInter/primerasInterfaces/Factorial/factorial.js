let n = 4;

function factorial(n){
    if(n <= 1)
        return (1);
    return n + factorial(n - 1);
}

let r = factorial(n);

document.getElementById("variable").innerText = n;
document.getElementById("resultado").innerText = r;


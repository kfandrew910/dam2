let n = 5;
let line;
let i, j;

for(j = 0; j < n; j++){
    line = "";
    for(i = 0; i < n - j; i++){
        line += " ";
    }
    for(i = 0; i < n + j * 2; i++){
        line += "*";
    }
    for(i = 0; i < n - j; i++){
        line += " ";
    }
    console.log(line + i);
}

for(;j >= 0; j--){
    line = "";
    for(i = 0; i < n - j; i++){
        line += " ";
    }
    for(i = 0; i < n + j * 2; i++){
        line += "*";
    }
    for(i = 0; i < n - j; i++){
        line += " ";
    }
    console.log(line + i);
}

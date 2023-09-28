let a = parseInt(Math.random() * 50) + 1;
let b = parseInt(Math.random() * 50) + 1;
let res = 0;

if(a > b)
    [a, b] = [b, a];

console.log("a: " + a + "\nb: " + b);

for(let i = a + 1; i < b; i++){
    console.log(i);
    res += i;
}
console.log("res= " + res);
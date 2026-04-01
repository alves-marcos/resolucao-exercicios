/*
    🟡 NÍVEL 2 – Loop + contador
    7 - Some apenas os números pares de 1 até 50.
*/

let numero = 50;
let soma = 0;

for(let i = 1; i <= numero;i++){
    if(i % 2 == 0){
        soma = soma + i;
    } 
}
console.log(soma);
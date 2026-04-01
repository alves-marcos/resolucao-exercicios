/*
    🟡 NÍVEL 2 – Loop + contador
    9 - Calcule a média dos números de 1 até 20.
*/

let numero = 20;
let contador = 0;
let soma = 0

for(let i = 1; i <= numero; i++){
    soma = soma + i;
}

let resultado = soma / numero;
console.log(resultado)
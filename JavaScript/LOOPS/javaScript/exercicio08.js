/*
    🟡 NÍVEL 2 – Loop + contador
    8 - Conte quantos números ímpares existem entre 1 e 100.
*/

let numero = 100;
let contador = 0;

for(let i = 1; i <= numero; i++){
    if(i % 2 !== 0){
        contador++
    }
}
console.log(contador)
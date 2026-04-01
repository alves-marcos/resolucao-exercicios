/*
    🟠 NÍVEL 3 – Loop + condição
    12 - Mostre todos os números entre 1 e 100 que são divisíveis por 4 e 6.
*/

let numero = 100;
let i = 1;

while(i <= numero){
    if(i % 4 === 0 && i % 6 === 0){
        console.log(i)
    }
    i++
}
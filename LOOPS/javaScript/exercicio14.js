/*
    🟠 NÍVEL 3 – Loop + condição
    14 - Peça um número N e mostre apenas os números pares de 1 até N
*/

let numero = Number(prompt("Digite um numero: "))
let i = 1;

console.log(`Esses são os números pares entre 1 a ${numero}`);

while(i <= numero){
    if(i % 2 === 0){
        console.log(i)
    }
    i++
}
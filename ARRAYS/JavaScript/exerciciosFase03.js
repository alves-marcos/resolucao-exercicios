/*
🟡 FASE 3 — Lógica com Array
9️⃣ Encontrar o maior número

Sem usar Math.max.

🔟 Encontrar o menor número
1️⃣ Encontrar a média dos números
2️⃣ Criar array só com números maiores que 10
3️⃣ Inverter array manualmente

Sem usar .reverse().
*/

const numeros = [
  17, 3, 25, 8, 42, 11, 29, 4, 36, 19,
  2, 50, 13, 27, 6, 31, 9, 44, 21, 14,
  39, 1, 33, 7, 48, 12, 26, 5, 40, 18
];

console.log("Lógica com Array")
console.log("")
console.log("Encontrar o maior número.")

let receber = 0;
for(let i = 0; i < numeros.length; i++){
    if(numeros[i] > receber){
        receber = numeros[i];             
    }        
}
console.log(receber)

console.log("");
console.log("Encontrar o menor número.");

let receberMenor = numeros[0];

for(let j = 0; j < numeros.length; j++){
    if(numeros[j] < receberMenor){
        receberMenor = numeros[j];
    }
}
console.log(receberMenor);

console.log("");
console.log("Encontrar a media dos NUMEROS");

let contador = 0;
let g = 0;

for(g; g < numeros.length; g++){
    contador = contador + numeros[g];
}

let media = contador / g;

console.log(`A média é : ${media.toFixed(2)}`);

console.log("");
console.log("Criar array só com números maiores que 10 !")


let novaLista = numeros.filter(function(n){
    return n > 10;
})

console.log(novaLista)


console.log("")
console.log("Inverter array manualmente")

let novoARR = [];

for(let r = numeros.length - 1;r >= 0; r--){
    novoARR.push(numeros[r]);
}
console.log(novoARR);

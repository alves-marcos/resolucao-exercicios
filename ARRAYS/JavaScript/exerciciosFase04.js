/*
🟠 FASE 4 — Strings + Array
4️⃣ Maiúsculas manual
let nomes = ["ana", "marcos", "joao"];

Crie um novo array com nomes em maiúsculo.

5️⃣ Contar letras

Crie um array com 5 palavras.
Mostre quantas letras cada palavra tem.

6️⃣ Encontrar palavra mais longa
*/

let nomes = ["ana", "marcos", "joao"];

let novoArray = nomes.map(function(nomes){
    return nomes.charAt(0).toUpperCase() + nomes.slice(1);
})

console.log(novoArray);

console.log("");
console.log("Contar letras");

let z = ["Toko", "Marcos", "Estevao", "Alves", "Costa"];

let contagem = z.map(function(conte){
    return conte.length;
})

console.log(contagem)


console.log("");
console.log("Encontrar palavra mais longa");
let maior = z[0]; // comece assumindo que a primeira palavra é a maior

for (let i = 1; i < z.length; i++) {
    if (z[i].length > maior.length) {
        maior = z[i]; // atualiza se encontrar uma palavra maior
    }
}

console.log(maior); // "Estevao"
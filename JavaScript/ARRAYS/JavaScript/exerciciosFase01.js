/*
🔵 FASE 1 — Fundamentos (Entender o que é Array)
1️⃣ Criar e acessar

Crie um array com 5 números.
Mostre:

O primeiro elemento

O terceiro elemento

O último elemento

O tamanho do array
*/

console.log("Exercicio Parte 01")
let lista = [2,4,6,8,10];
console.log(lista)

console.log("O primeiro elemento é: " + lista[0]);

console.log("O terceiro elemento é : " + lista[2]);

console.log("O ultimo elemento é: " + lista.at(-1));

console.log("O array tem tamanho de: " + lista.length);

console.log("_______________________________")

/*
2️⃣ Modificar valor pelo índice
let cores = ["azul", "verde", "vermelho"];

Troque "verde" por "amarelo" e mostre o array.

3️⃣ push e pop

Crie um array vazio

Adicione 3 nomes usando push

Remova o último usando pop

Mostre o resultado final

4️⃣ shift e unshift

Adicione um elemento no início

Remova o primeiro elemento
*/
console.log("")
console.log("Exercicio Parte 02")

let cores = ["azul", "verde", "vermelho"];

console.log(cores)

cores[1] = "amarelo";
console.log(cores)

let listavazia = [];
console.log(listavazia);

listavazia.push("Ar", "Fogo", "Terra");
console.log(listavazia);

listavazia.pop();
console.log(listavazia);

listavazia.unshift("Agua");
console.log(listavazia);

console.log(listavazia.shift())

console.log(listavazia)
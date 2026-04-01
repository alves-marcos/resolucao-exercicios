/*
🟢 FASE 2 — Loop + Array (Base sólida)
5️⃣ Mostrar todos os elementos
let numeros = [4, 8, 15, 16, 23, 42];

Use for para mostrar todos.

6️⃣ Somar todos os números

Sem usar métodos prontos.

7️⃣ Multiplicar todos por 2

Crie um novo array com todos os números multiplicados por 2.

8️⃣ Contar pares

Conte quantos números são pares.
*/

console.log("Exercicio Parte 01");
let numeros = [4, 8, 15, 16, 23, 42];

let soma = 0;

console.log("Use for para mostrar todos.")
for (let i = 0; i < numeros.length; i++) {
  console.log(numeros[i]);
}

console.log("");
console.log("Somar todos os números")
for (let j = 0; j < numeros.length; j++) {
    let elemento =  numeros[j];
   
    soma = soma + elemento;
    
}

console.log("A soma é: " + soma);

console.log("");
console.log("Multiplicar todos por 2")

let multi = 0;

for(x = 0; x < numeros.length; x++){
  multi = numeros[x] * 2;
  console.log(multi);
}

console.log("Crie um novo array com todos os números multiplicados por 2.")


let novaLista = numeros.map(function(numeros){
  return numeros * 2;
}
)

console.log(novaLista)

console.log("Contar Pares")

let contador = 0;

for (let y = 0; y < numeros.length; y ++){
  if(numeros[y] % 2 == 0){
    contador++
  }
}
console.log(`Os número pares são um total de ${contador}`)




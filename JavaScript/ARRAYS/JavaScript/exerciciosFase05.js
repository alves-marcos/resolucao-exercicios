/*
🔴 FASE 5 — Desafios (Nível Odin)
7️⃣ Remover duplicados
let numeros = [1,2,2,3,4,4,5];

Crie um novo array sem repetição.

8️⃣ Verificar se existe um número

Peça um número e verifique se ele existe no array.

9️⃣ Contar quantas vezes um número aparece
0️⃣ Simular lista de compras

Adicione itens

Remova itens

Mostre lista final

Mostre total de itens
*/

let numeros = [1,2,2,3,4,4,5];
let newLista = [...new Set(numeros)];

let multiplicar = numeros.map(function(num){
    return num;
    
})
console.log(multiplicar)
console.log(newLista)

console.log("verificar se existe o número")

let existe = numeros.includes(100);
let contador = 0;

console.log(existe ? "Existe o numero 5" : "Não existe")

for(let j = 0; j < numeros.length; j++){
    if(numeros[j] === 3){
        contador++
    }
}
console.log(contador)
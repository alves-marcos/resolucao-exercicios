/*
    🔴 NÍVEL 4 – Loop dentro de loop
    15- Faça um quadrado 5x5 usando *:
*/

let valor = "*";
let mostrar = "";
let pularLinha = "\n";

for (let j = 1; j <= 5; j++) {
  for (let i = 1; i <= 5; i++) {
    mostrar = mostrar + valor;  
  }
  mostrar = mostrar + pularLinha;
}

console.log(mostrar);

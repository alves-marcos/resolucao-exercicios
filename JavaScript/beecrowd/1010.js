// beecrowd - 1010 - Cálculo Simples
// Conceitos: Realizar um calculo simples, porém foi necessário utilizar o metodo split(),
// o qual permite separar o que sera inserido. No caso abaixo, é usado o split()
// para criar uma matriz, e idicar a posição de cada elemento que será inserido logo após,
// conforme mostra abaixo pelos indices [0], [1] e [2]



// ===== Minha solução =====

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha1 = lines.shift().split(' ');
let linha2 = lines.shift().split(' ');

let id01 = Number(linha1[0]);
let numPecas01 = Number(linha1[1]);
let valueUnit01 = Number(linha1[2]);

let id02 = Number(linha2[0]);
let numPecas02 = Number(linha2[1]);
let valueUnit02 = Number(linha2[2]);

let resultado01 = (numPecas01 * valueUnit01);
let resultado02 = (numPecas02 * valueUnit02);

let total = resultado01 + resultado02;

console.log(`VALOR A PAGAR: R$ ${total.toFixed(2)}`)
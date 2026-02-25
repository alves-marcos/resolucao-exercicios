// beecrowd - 1007 - Diferença
// Conceitos: Realizar cálculo de multiplicação e subtração


// ===== Minha solução =====

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let A = Number(lines.shift());
let B = Number(lines.shift());
let C = Number(lines.shift());
let D = Number(lines.shift());

let diferenca = ((A * B) - (C * D))

console.log(`DIFERENCA = ${diferenca}`)
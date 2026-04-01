// beecrowd - 1006 - Média 2
// Conceitos: Realizar cálculo de média ponderada de tres valores


// ===== Minha solução =====

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let A = Number(lines.shift());
let B = Number(lines.shift());
let C = Number(lines.shift());

let media = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

console.log(`MEDIA = ${media.toFixed(1)}`)
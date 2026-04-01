// beecrowd - 1005 - Média 1
// Conceitos: Realizar cálculo de média ponderada de dois valores


// ===== Minha solução =====


var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let A = Number(lines.shift());
let B = Number(lines.shift())

let media = ((A * 3.5) +(B * 7.5)) / (3.5 + 7.5)

console.log(`MEDIA = ${media.toFixed(5)}`)
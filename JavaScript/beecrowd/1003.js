var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let A = Number(lines.shift())
let B = Number(lines.shift())
let soma = A + B

console.log(`SOMA = ${soma}`)
// beecrowd - 1008 - Salário
// Conceitos: Realizar cálculo de salário, onde recebo um ID de funcionário, Numero Horas trabalhadas,
// valor por hora, e calcular o resultado.


// ===== Minha solução =====

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let id = Number(lines.shift());
let numHoursWork = Number(lines.shift());
let pagHours = Number(lines.shift());

let salary = numHoursWork * pagHours;

console.log(`NUMBER = ${id}`);
console.log(`SALARY = U$ ${salary.toFixed(2)}`);
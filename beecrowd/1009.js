// beecrowd - 1009 - Salario com Bonus
// Conceitos: Receber um input com String, e realizar calculo de salario de um funcionario, utilizando:
// salario fixo e total de vendas(15% de comissão)


// ===== Minha solução =====

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let name = lines.shift();
let salaryFix = Number(lines.shift());
let totalSales = Number(lines.shift());

let calcule = totalSales * 0.15;

let total = calcule + salaryFix;

console.log(`TOTAL = R$ ${total.toFixed(2)}`)
const prompt = require('readline-sync');

let saldo = Number(prompt.question("Qual eh o seu saldo?"));


if(saldo < 0){

   saldo =  Number(prompt.question("Saldo inválido! Por Favor, informe novamente: "));
}

console.log(saldo);
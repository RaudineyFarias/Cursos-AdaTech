const prompt = require("readline-sync"); //Importar biblioteca 

const idade = prompt.question("Qual é a sua idade? "); //o question permite que o usuario digite no terminal do vscode

const idadeNumber = Number(idade);// a forma correta de converter o tipo da variavel

console.log("A idade do usuário é:", idade," Anos");

console.log("o tipo da variavel é:", typeof idadeNumber);
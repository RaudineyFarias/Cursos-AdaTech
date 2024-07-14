const rl = require("readline");

const prompt = rl.createInterface({
    input: process.stdin,
    output: process.stdout

})
const promptPromise = {
    question: (pergunta) => new Promise((resolve, reject) =>{
        try{prompt.question((pergunta), (resposta) => resolve(resposta))

        }catch(error){
            reject(error)
        }
}),
close: ()=>  prompt.close()
}

// prompt.question("Digite um numero: ", (Resposta) => {

//     console.log('O dobro desse numero é: ', parseInt(Resposta*2)); //Aqui eu coloquei a variavel dentro do console com essa função de $ e ainda converti a string em Numero Inteiro
//     prompt.close();    //Fecha a entrada de dados
// })
// prompt.question("Digite uma cor: ", (Resposta) => {

//     console.log('A sua cor é:  ',Resposta)
//     prompt.close();
// })    

async function askUser(){
    const numero = await promptPromise.question("Digite um numero: ")
    console.log('O dobro desse numero é: ',numero *2);

    const cor = await promptPromise.question("Digite uma cor: ")
    console.log('A sua cor é:  ',cor)
    promptPromise.close()

}

     //Aqui eu coloquei a variavel dentro do console com essa função de $ e ainda converti a string em Numero Inteiro
askUser()
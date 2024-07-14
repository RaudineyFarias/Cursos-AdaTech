//O swicth é melhor aproveitado quando sua vaviavel possue valor especifico
const permissoes = "aluno"; //aluno | Professor | Admin

switch(permissoes){
    case "aluno":
        console.log("Você pode apenas visualizar as aulas");
        break
    case "professor":
        console;log("Você pode alterar as aulas!")
        break
    case "admin":
        console.log("Você pode fazer o que quiser!")
        break
    default:
        console.log("Não conheço você no sistema")        

    }   
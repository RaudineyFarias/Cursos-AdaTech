public class Condicional {
    public static void main(String[] args) {

        int  nota1 = 70;
        int nota2 = 90;

        int media = (nota1+nota2)/2;

        String graduacao;

        if (media >= 70){
            graduacao = "Aprovado";
        } else if (media <= 69) {
             graduacao = "Recuperação!";

        }else if(media <50){
             graduacao = "Reprovado";
        }
        else{
             graduacao = null;
        }

        switch (graduacao){
            case "Aprovado":
                System.out.println("Aluno Aprovado!");
                break;
            case "Recuperação":
                System.out.println("Aluno em Recuperação!");
                break;
            case "Reprovado":
                System.out.println("Aluno Reprovado!");
                break;

        }


    }
}

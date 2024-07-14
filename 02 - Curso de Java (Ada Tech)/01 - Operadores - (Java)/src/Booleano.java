public class Booleano {
    public static void main(String[] args) {
        boolean fimDeSemana= true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;


        if (vamosAPraia == true){
            System.out.println("Sim, Vamos a praia");
        }else{
            System.out.println("Não Vamos à praia");
        }

    }


}

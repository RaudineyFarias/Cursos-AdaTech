package Animais;

public class Cachorro extends Animal {


    private int tamanhoDoRabo;
    static int numeroDeCachorro;


    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(nome, cor, altura, peso);

        numeroDeCachorro ++;
    }

    public int getNumeroDeCachorro() {

        return numeroDeCachorro;
    }

    public void setNumeroDeCachorro(int numeroDeCachorro) {

        this.numeroDeCachorro = numeroDeCachorro;
    }

    public String pegar(){

        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "Carinho":
                this.estadoDeEspirito = "Feliz";
                break;
            case "Vai Dormir":
                this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro ";
                break;


        }
        return this.estadoDeEspirito;


    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void EmitirSom() {
        System.out.println("Cachorro Latindo!");
    }
}




//Fazendo com IF
//        if (acao.equalsIgnoreCase("Carinho")) {
//            this.estadoDeEspirito = "Feliz";
//        } else if (acao.equalsIgnoreCase("vai dormir")) {
//            this.estadoDeEspirito = "Bravo";
//        } else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return this.estadoDeEspirito;

package Animais;

public class Gato extends Animal{

    static int numeroDePassaros;


    public Gato(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void EmitirSom() {
        System.out.println("Gato Fazendo Miau");
    }
}

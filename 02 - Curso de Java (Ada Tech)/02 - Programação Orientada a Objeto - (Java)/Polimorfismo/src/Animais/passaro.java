package Animais;

public class passaro extends Animal{

    static int numeroDePassaros;

    public passaro(String nome, String cor, int altura, double peso) {
        super(nome, cor, altura, peso);
    }

    @Override
    public String toString() {
        return "passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void EmitirSom() {
        System.out.println("Passaro Cantando!");
    }
}

package Animais;

public class Animal {


    protected String nome;
    protected String cor;
    protected int altura ;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(String nome, String cor, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
    }

    protected void comer(){}

    protected void dormir(){}

    public void EmitirSom(){
        System.out.println("Animal Emitindo som");

    }


}

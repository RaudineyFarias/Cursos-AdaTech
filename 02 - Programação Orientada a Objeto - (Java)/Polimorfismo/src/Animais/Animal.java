package Animais;
import java.lang.String;

public abstract class Animal {


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

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getCor() {
        return cor;
    }

    public void setCor(java.lang.String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public java.lang.String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(java.lang.String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer(){}

    protected void dormir(){}

    public abstract void EmitirSom();


}

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.passaro;

import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("myk", "Marrom", 25,5.5,15,"Carinho");
        Gato gato1 = new Gato("nino", "Branco", 25, 5.5);
        passaro passaro1 = new passaro("dlougas", "amarelo", 1, 0.5);



        cachorro1.EmitirSom();
        gato1.EmitirSom();
        passaro1.EmitirSom();

    }
}



















//        Cachorro cachorro1 = new Cachorro("myk", "Marrom", 25,5.5,15,"Carinho");
//        //Dessa forma Posso fazer depois que definir o constructor
//
//        System.out.println(cachorro1.getNumeroDeCachorro());//Essa impressão vai falar sobre o numero de objetos que foram construidos
//
//        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25,5.5,15,"Carinho");
//
//        System.out.println(cachorro1.getNumeroDeCachorro());
//        System.out.println(cachorro1.getNumeroDeCachorro());
//
////        System.out.println(cachorro1.toString());//Essa forma de impressão o código ele só vai imprimir a variável que tiver definido o ToString lá na Classe Cachorro
////        System.out.println(cachorro2.toString());


//Cachorro cachorro1 = new Cachorro("myk", "Marrom", 25,5.5,15,"Carinho");
////Dessa forma Posso fazer depois que definir o constructor
//
//            System.out.println(cachorro1.getNome());//Sempre quando for imprimir o variavel você tem que imprimir com o GetNome
//        System.out.println(cachorro1.pegar());
//        System.out.println("O cachorro está "+cachorro1.interagir("Carinho"));
//        System.out.println("O cachorro está "+cachorro1.interagir("Vai Dormir"));
//        System.out.println("O cachorro está "+cachorro1.interagir("pisar na patinha"));
//        System.out.println("O cachorro está "+cachorro1.interagir("nada"));
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

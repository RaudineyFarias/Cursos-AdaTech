import Animais.Cachorro;
import Animais.Gato;
import Animais.passaro;
import lojas.petShop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("XUXU","Marrom",15,5.5,15);

        Gato gato1 = new Gato("nino", "Branco", 15,5.5);

        passaro passaro = new passaro("Xibiu", "Amarelo", 15,0.5);

        petShop petshop = new petShop();

        petshop.tomarBanho(cachorro1);
        System.out.println("O Dog já está " + cachorro1.getEstadoDeEspirito());

        petshop.tomarBanho(gato1);
        System.out.println("O Cat já está " + gato1.getEstadoDeEspirito());

        petshop.Tosar(cachorro1);
        System.out.println("O Cat já está " + cachorro1.getEstadoDeEspirito());

    }
}
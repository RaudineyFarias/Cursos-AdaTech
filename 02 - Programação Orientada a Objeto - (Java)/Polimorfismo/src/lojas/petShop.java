package lojas;

import Animais.Animal;
import Animais.Cachorro;

public class petShop {
    public void tomarBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void Tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("tosado");
    }
    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Saudades");
    }
}

package implemention;

import java.sql.SQLOutput;

public class SupermarketArrray implements Supermarket{

    private final String[] itens;

    private int lastIndex;

    public SupermarketArrray(final int size) {
       itens = new String[size];
       lastIndex = -1;
    }


    @Override
    public void add(String item) {
        if(lastIndex == itens.length-1){
            System.err.println("Lista de Supermercado cheia");
        }else{
            lastIndex++;
            itens[lastIndex] = item;
        }

    }

    @Override
    public void print() {
        System.out.println("##################");
        if (lastIndex < 0) {
            System.out.println("Lista de supermercado *vazia*");
        }
        System.out.println("##################");
        for (int i  = 0; i <= lastIndex; i++){

            System.out.println(i +" - "+ itens[i]);
        }

    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        }else {
            System.err.println("Indice inválido: "+ index);

        }

    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++){
            itens[i] = itens[i+1];
        }
    }
}

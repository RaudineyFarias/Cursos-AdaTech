import java.lang.reflect.Array;
import java.util.Arrays;

public class array_listas_string {
    public static void main(String[] args) {
        //String[] letras = new String[5];
        //
        //        letras [0] = "A";
        //        letras [1] = "B";
        //        letras [2] = "C";
        //        letras [3] = "D";
        //        letras [4] = "E";

        String[] letras = {"A", "B", "C", "D", "E"};

        for (int i =0; i < letras.length; i++ ){
            System.out.println(letras[i]);//essa forma imprime o código na vertical
        }//Esse laço vai pecorrer a lista e olhar todos os elementos e depois fazer o print

        System.out.println(Arrays.toString(letras));//essa forma imprime o código na Horizintal
    }
}

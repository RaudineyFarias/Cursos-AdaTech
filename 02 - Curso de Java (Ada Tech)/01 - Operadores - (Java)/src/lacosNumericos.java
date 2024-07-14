public class lacosNumericos {
    public static void main(String[] args) {
        for (int i = 1 ; i <=10; i ++){
            for ( int j = i; j <= 10 ; j++ ){
                //System.out.println(j * 1); //Esse trecho de código substitui esse outro trecho que está abaixo
                System.out.println(j + "x" + i + " = "+ j*i);// Jà esse trecho refatora esse trecho de cima
            }
        }
    }
}


//Lembrando que o laço for que está dentro do outro for substitui esse outro

//    System.out.println(1 * i);
//            System.out.println(2 * i);
//            System.out.println(3 * i);
//            System.out.println(4 * i);
//            System.out.println(5 * i);
//            System.out.println(6 * i);
//            System.out.println(7 * i);
//            System.out.println(8 * i);
//            System.out.println(9 * i);
//            System.out.println(10 * i);
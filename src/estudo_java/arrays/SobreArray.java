package estudo_java.arrays;

public class SobreArray {
    public static void main(String[] args) {

////        int[] array;   // declaracao de arrays
////
////        array = new int[]{10,29,38,47};z
////
////
////        System.out.println(array[3]);
////
////
//        String[] nomes;
//        nomes = new String[]{"Dantas", "Eloah", "Joaquim", "Maria"};
//
//        for (int i = 0; i < nomes.length; i++) {   // enquanto 0 for menor doq as posicoes ele printa
//            System.out.println(nomes[i]);
//
//        }
//
//        System.out.println("------------------------");
//
//        String[] animes;
//
//        animes = new String[]{"One picie", "DG", "Naruto "};
//
//        for (String anime : animes)
//            System.out.println(anime);
//
//
//        System.out.println("-----------------------------------");
//
//
//        int[] idade;
//
//        idade = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//
//        for (int i = 0; i < idade.length; i++) {
//
//            System.out.print(idade[i]);
//        }
//

        // exercicio array

        double[] nota;

        nota = new double[5];

        nota[0] = 3;
        nota[1] = 2;
        nota[2] = 6;
        nota[3] = 7;
        nota[4] = 9;


            for (int i = 0; i < nota.length; i++) {

                System.out.print(nota[i] + " , "  );

        }



            for (double notas: nota){
                System.out.print(  notas + " , " );
            }


    }
}

package collections.list.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {


        List<String> nomes = new ArrayList<>();
        nomes.add("Daniel");
        nomes.add("Eloah");
        nomes.add("Joaquim");

        for (String nome : nomes) {
            System.out.println(nome);

        }
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));

        }


        List<Integer> numero = new ArrayList<>();
        List<Integer> numero2 = new ArrayList<>();

        numero.add(1);
        numero.add(2);
        numero2.add(3);
        numero2.add(4);

        numero.addAll(numero2);

        for (Integer numeros : numero){
            System.out.println(numeros);

        }






    }
}

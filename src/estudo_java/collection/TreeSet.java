package estudo_java.collection;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {


        /*

         o TreeSet usa uma arvore binaria,
         ordena por ordem alfabetica/numerica

         */

        Set<String> nomes = new java.util.TreeSet<>();

        nomes.add("Dantas");
        nomes.add("Eloah");


        System.out.println("Ordem alfabetica: " + nomes);





    }
}

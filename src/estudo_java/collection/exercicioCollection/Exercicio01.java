package estudo_java.collection.exercicioCollection;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        // lista aceita duplicatas
        List<String> lista = new ArrayList<>();

        lista.add("");
        lista.add("");
        lista.add("");
        lista.remove("");

        System.out.println(lista);

        System.out.println("========================");

        // map chave, valor
        Map<Integer, String> map = new HashMap<>();

        map.put(1,"");
        map.put(2,"");

        System.out.println(map.get(2));

        System.out.println("==================");

        // nao aceita duplicatas

        Set<String> set = new HashSet<>();

        set.add("");
        set.add("");
        System.out.println(set);
        set.clear();
        System.out.println(set);





    }
}

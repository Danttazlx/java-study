package estudo_java.collection.exercicioCollection;

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("dantas");
        lista.add("Dantas");
        lista.add("joaquim");
        lista.remove("dantas");

        System.out.println(lista);

        System.out.println("========================");

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Dantas");
        map.put(2,"Eloah");

        System.out.println(map.get(2));

        System.out.println("==================");

        // nao aceita duplicatas
        
        Set<String> set = new HashSet<>();

        set.add("oi");
        set.add("vz");
        System.out.println(set);
        set.clear();
        System.out.println(set);





    }
}

package estudo_java.collection.exercicioCollection;

import java.util.Map;
import java.util.HashMap;

public class ExercicioMap {
    public static void main(String[] args) {

        Map<Integer,String> nome = new HashMap<>();


        nome.put(1, "Dantas");


        System.out.println("dados map: " + nome.get(1));


    }
}

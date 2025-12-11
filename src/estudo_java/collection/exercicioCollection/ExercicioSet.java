package estudo_java.collection.exercicioCollection;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {

        Set<String> jogos = new HashSet<>();

        jogos.add("Clash Royale");
        jogos.add("Free fire");
        jogos.add("CS2");

        jogos.remove("Clash Royale");

        System.out.println("Lista de jogos: " + jogos);


        // linkedlist Ordem de insercao
        System.out.println("------------------------------------");

        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.clear();

        System.out.println("LinkedList: " + numeros);




    }
}

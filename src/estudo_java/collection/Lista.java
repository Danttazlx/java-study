package estudo_java.collection;


import java.util.*;

public class Lista {
    public static void main(String[] args) {

        List<String> brasileirao = new ArrayList<>();

        brasileirao.add("Sao Paulo");
        brasileirao.add("Santos ");
        brasileirao.add("Palmeiras ");
        brasileirao.add("Corinthians");

        List<String> outraListaTimes = Arrays.asList("Flamengo"," Internacional");
        brasileirao.addAll(outraListaTimes);

        System.out.println("Times do Brasileirao: " + brasileirao);


    }
}

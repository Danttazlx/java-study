package estudo_java.collection;

import java.util.*;

public class Lista {
    public static void main(String[] args) {

        List<String> brasileirao = new ArrayList<>();

        brasileirao.add("Sao Paulo");
        brasileirao.add("Santos ");
        brasileirao.add("Palmeiras ");
        brasileirao.add("Corinthians");


        List<String> outraListaTimes = Arrays.asList("Flamengo", " Internacional");
        brasileirao.addAll(outraListaTimes);






        /* Arrays.asList() cria uma lista de TAMANHO FIXO
         - Não pode adicionar: .add() → UnsupportedOperationException
         - Não pode remover: .remove() → UnsupportedOperationException
         - Pode modificar: .set(index, valor) → ✅ Funciona!

         */


        /*
       new ArrayList<>(Arrays.asList(...)) cria lista MODIFICÁVEL
       - O ArrayList COPIA os valores para um NOVO array próprio
       - Agora pode: .add(), .remove(), .set() → ✅ Tudo funciona!.

         */


        List<String> maisTimesBrasileirao = new ArrayList<>(Arrays.asList("Gremio", "Fortaleza"));
        brasileirao.addAll(maisTimesBrasileirao);

        System.out.println("Times do Brasileirao: " + brasileirao);


    }
}

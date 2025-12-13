package estudo_java.lambda;

import java.util.*;

public class LambdaEx {
    public static void main(String[] args) {

        List<Integer> listaNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100);
        List<Integer> listPares = new ArrayList<>();

        listaNumber.forEach((numero) -> {

            if(numero % 2 == 0){
                listPares.add(numero);
            }

        });
        System.out.println("numeros pares: " + listPares);

    }
}

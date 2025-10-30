package estudo_java.exercicio;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int a = scanner.nextInt();


        System.out.println("digite outro numero: ");
        int b = scanner.nextInt();

        var soma = a + b;

        System.out.println("A soma entre os dois numeros é " + soma);


    }


}

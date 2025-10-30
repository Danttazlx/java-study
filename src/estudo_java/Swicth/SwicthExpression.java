package estudo_java.Swicth;

import java.util.Scanner;

public class SwicthExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("me diga um  dia da semana: ");
        int day = scanner.nextInt();


        switch (day) {

            case 1 -> System.out.println("segunda");
            case 2 -> System.out.println("terca");
            case 3 -> System.out.println("quarta");
            case 4 -> System.out.println("quinta");
            case 5 -> System.out.println("sexta");
            case 6 -> System.out.println("sabado");

            default -> System.out.println("invalido!");

        }
        scanner.close();

    }




}

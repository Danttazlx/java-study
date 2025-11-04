package estudo_java.Swicth;

import java.util.Scanner;

public class ExercicioSwicth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua avaliacao numerando de 1 a 5");
        int avaliacao = scanner.nextInt();

        String avalicaoCliente = switch (avaliacao) {

            case 1 -> "muito bom";
            case 2 -> "Otimo";
            case 3 -> "Satisfeito";
            case 4 -> "Neutro";
            case 5 -> "insatisfeito";

            default -> "Numero Invalido,(deve esta de um 1 a 5)";

        };
        System.out.println(avalicaoCliente);

        scanner.close();


    }
}

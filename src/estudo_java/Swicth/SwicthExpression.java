package estudo_java.Swicth;

import java.util.Locale;
import java.util.Scanner;

public class SwicthExpression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("me diga um  dia da semana: ");
        String day = scanner.nextLine();

        String tipoDoDia = switch (day) {
            case "segunda", "terca", "quarta", "quinta", "sexta" -> "dia Utiu";
            case "sabado", "domingo" -> "final de semanda";

            default -> "invalido!!";
        };

        System.out.println(tipoDoDia);
        scanner.close();

    }


}

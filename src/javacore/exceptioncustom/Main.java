package javacore.exceptioncustom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }

    private static void login() throws LoginInvalidException {
        try (Scanner scanner = new Scanner(System.in)) {
            String nameDB = "Naruto";
            String name = scanner.nextLine();
            String passwordDB = "Hokage";
            String password = scanner.nextLine();

            if (!name.equals(nameDB) || !password.equals(passwordDB))
                throw new LoginInvalidException("name or password invalid");
        }
        System.out.println("Obrigado!");
    }

}
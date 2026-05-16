package javacore.exceptionfile;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

  createNewFile();
    }

    

    private static void createNewFile(){

        File file = new File("arquivo\\test.txt");

        try {
            Boolean isCriado = file.createNewFile();
            System.out.println("arquivo criado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
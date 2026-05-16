package javacore.tryWithResource.test;

import javacore.tryWithResource.domain.Conecxao01;
import javacore.tryWithResource.domain.Conecxao02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
      abreConecxao();

    }

    private static void abreConecxao() {

         /*
         a interface Autocloseble tem apenas um metodo que fecha
         ele que é usado no try-with-resource
         */

        try (
                Conecxao01 conecxao01 = new Conecxao01();
                Conecxao02 conecxao02 = new Conecxao02();
        ){

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

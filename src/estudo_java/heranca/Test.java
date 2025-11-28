package estudo_java.heranca;

import estudo_java.heranca.domain.Animal;
import estudo_java.heranca.domain.Cachorro;
import estudo_java.heranca.domain.Tigre;

public class Test {
    public static void main(String[] args) {

        Tigre tigre = new Tigre("tigre do dogmanso", "felino");

        tigre.come();
        tigre.huiva();


        System.out.println("------------------");

        Cachorro cachorro = new Cachorro("cachorro dogmal", "Carnivoro");
        cachorro.come();
        cachorro.latir();



    }
}

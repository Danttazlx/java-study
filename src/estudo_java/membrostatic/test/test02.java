package estudo_java.membrostatic.test;

import estudo_java.membrostatic.domain.Cart;

public class test02 {
    public static void main(String[] args) {



        Cart cart = new Cart("BMW X1","BMW", "600Km");
        cart.imprime();
        System.out.println("velocidade Minima: " + Cart.VELOCIDE_MIN);

        System.out.println("--------------------------");

        Cart cart1 = new Cart("Huracán Evo Spyder", "Lamborghini","750km");
        cart1.imprime();
        System.out.println("velocidade Minima: "+ Cart.VELOCIDE_MIN);
    }



}

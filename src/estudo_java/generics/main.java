package estudo_java.generics;


public class main {
    public static void main(String[] args) {

        Generic<String> nomes = new Generic<>();
        nomes.guardar("Dantas");
        var pegar = nomes.getItem();
        System.out.println("nome: " + pegar);

        System.out.println("-------------------------------------------");

        Generic<Integer> numero = new Generic<>();

        numero.guardar(2);
        var numeros = numero.getItem();
        System.out.printf("numero:" + numeros);


    }
}

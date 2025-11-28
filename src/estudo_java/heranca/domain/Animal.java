package estudo_java.heranca.domain;

public class Animal {

    private String nome;
    private  String tipo;


    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    public  void come(){

        System.out.println("Comendo");

    }

}

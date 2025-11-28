package estudo_java.heranca.domain;

public class Tigre extends Animal {

    public Tigre(String nome, String tipo) {
        super(nome, tipo);
    }


    public void huiva(){
        System.out.println("huiva");
    }


}

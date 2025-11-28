package estudo_java.heranca.domain;

public class Cachorro extends  Animal{
    public Cachorro(String nome, String tipo) {
        super(nome, tipo);
    }



    public void latir(){
      super.fazerSom();
        System.out.print("latindo");

    }

    @Override
    public void come() {
        super.come();
    }
}

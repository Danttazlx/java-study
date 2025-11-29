package estudo_java.annotation.domain;

public class Previdencia {

    @Deprecated
    public void mostrarRegraAposentadoria(){   // metodo obsoleto

        System.out.println("Regras aposentadoria");

    }

    public void mostrarNovaRegraAposentadoria(){

        System.out.println("Novas Regras Aposentadoria");

    }



}

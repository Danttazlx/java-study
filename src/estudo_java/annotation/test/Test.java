package estudo_java.annotation.test;

import estudo_java.annotation.domain.Previdencia;

public class Test {

    public static void main(String[] args) {

        Previdencia regras = new Previdencia();

        // antes da previdencia

        regras.mostrarRegraAposentadoria();
        
        // depois da prvidencia

        regras.mostrarNovaRegraAposentadoria();



    }


}

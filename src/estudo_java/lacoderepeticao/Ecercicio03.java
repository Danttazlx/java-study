package estudo_java.lacoderepeticao;

public class Ecercicio03 {
    public static void main(String[] args) {


        int codigoDeSaida = 9;

        for (int codigoDaCarterinha = 1; codigoDaCarterinha < 11; codigoDaCarterinha++) {

            if (codigoDaCarterinha == codigoDeSaida) {
                break;
            }
            if (codigoDaCarterinha == 3 || codigoDaCarterinha == 7 || codigoDaCarterinha == 10) {
                System.out.println("a carterinha " + codigoDaCarterinha + " é aceito pelo hosptal");
                continue;
            }
            System.out.println("a carterinha:  " + codigoDaCarterinha + " nao é aceita pelo hosptal santa clara");

        }


    }
}

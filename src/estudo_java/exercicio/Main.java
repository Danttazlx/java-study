package estudo_java.exercicio;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        long b = 2L;              // a gente sempre tem que fazer a conversao de Tipos, int c = a + b; <- dessa forma nao vai
        long c = a + b;

        System.out.println(c);


        int d = 1;                          // aqui a mesma situacao voce acaba tendo um erro
        float e = 10;
        long f = (long) e + d;             // esse cast voce esta falando que voce tem certeza dessa conversao de cast




    }
}

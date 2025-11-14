package estudo_java.sobrecargametodo;

public class Test {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somar(10,10);

        System.out.println("---------------------------------------------");

        calculadora.somar(10, 10,2);
    }
}

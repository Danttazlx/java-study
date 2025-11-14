package estudo_java.sobrecargametodo;

public class Calculadora {

/*
  a diferenca entre sobrecarga de metodos e contrutores é que voce pode retornar o metodo
  ja o contrutor voce nao pode e o contrutor deve conter o mesmo nome da class

 */

    public void somar(int a, int b) {
        var soma = a + b;
        System.out.println("soma com 2 numeros: " + soma);
    }

    public void somar(int a, int b , int c ) {

        var somar = a + b + c;
        System.out.println("soma com 3 numeros: " + somar);

    }

}

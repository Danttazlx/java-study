package estudo_java.passagemdevalor;

public class Funcionario {

    private String nome;
    private double salario;



    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;



    }

    public void imprime(){
        System.out.println("valor: " + salario);
        System.out.println("---------------------------------");

    }



    public void reajuste(double valor){
         var valorTotal = salario += valor;

        System.out.println("valorTotal: " + valorTotal);
    }





}
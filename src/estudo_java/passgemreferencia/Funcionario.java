package estudo_java.passgemreferencia;

public class Funcionario {

    private String nome;
    public double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;


    }

    public void imprime() {
        System.out.println("valor: " + salario);
        System.out.println("---------------------------------");

    }


    public void auterarSalario(double novoSalario) {
        salario += novoSalario;
        novoSalario += 1000;    // quando modificamos dentro do metodo nao modifica fora

    }

    public void auterarQualquerValor(Funcionario func, double reajusteSalario) {

        func.salario += reajusteSalario;


    }




}
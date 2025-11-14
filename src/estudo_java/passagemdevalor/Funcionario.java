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


    public void auterarSalario( double novoSalario){
        salario += novoSalario;
        novoSalario += 1000;    // quando modificamos dentro do metodo nao modifica fora
 
    }





}
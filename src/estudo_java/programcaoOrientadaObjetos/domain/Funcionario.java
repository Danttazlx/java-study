package estudo_java.programcaoOrientadaObjetos.domain;

public class Funcionario {

    private String cargo;
    private int idade;
    private double salario;

    public Funcionario(String cargo, int idade, double salario) {
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario(String cargo, double salario) {
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprime() {
        System.out.println("-------------------------------");

        System.out.println("cargo: " + cargo);
        System.out.println("idade: " + idade);
        System.out.println("salario: " + salario);
    }

    @Override
    public String toString() {
        return
                "------------------------" + "\n" +
                "cargo: " + cargo + "\n" +
                "salario: " + salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

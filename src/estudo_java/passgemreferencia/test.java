package estudo_java.passgemreferencia;

public class test {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("dantas", 5000);
        funcionario.imprime();

        funcionario.auterarQualquerValor(funcionario, 8000);


        funcionario.salario = 100;
        funcionario.imprime();
    }
}

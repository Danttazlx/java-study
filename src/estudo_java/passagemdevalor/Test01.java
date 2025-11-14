package estudo_java.passagemdevalor;

public class Test01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Dantas", 3000);
          funcionario.imprime();

        funcionario.auterarSalario( 8000.00);
        funcionario.imprime();

    }
}

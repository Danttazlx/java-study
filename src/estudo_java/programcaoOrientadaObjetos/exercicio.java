package estudo_java.programcaoOrientadaObjetos;

import estudo_java.programcaoOrientadaObjetos.domain.Funcionario;

public class exercicio {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Engenheiro de Software, Junior", 22, 4000);
        funcionario.imprime();


        Funcionario funcionario2 = new Funcionario("Engenheiro de Software, Estagio", 1600);

        System.out.println(funcionario2.toString());
    }

}

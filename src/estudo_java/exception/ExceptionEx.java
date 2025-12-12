package estudo_java.exception;

public class ExceptionEx {
    public static void main(String[] args) {

        // vamos fazer uma divisao por zero para nos tratarmos a exception


/*
   try{

            int media = aluno / nota ;

        }finally {
            System.out.println("Programa finalizado");
        }

  isso resulta em uma excecao sem tratamento

 */





        /*
        try ele tenta execultar mas caso resulte em Excecao o
        catch preve com as boas praticas de  aproxima o tipo da Exception
        finally um bloco de codigo que sempre ira execultar

         */

        var aluno = 10;
        var nota = 0;

        try {

            int media = aluno / nota;

        } catch (ArithmeticException e) {

            System.out.println("Nao Pode Divisao Por Zero.");

        } finally {
            System.out.println("Programa finalizado");
        }


    }
}

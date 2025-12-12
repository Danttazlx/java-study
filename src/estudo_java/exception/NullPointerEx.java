package estudo_java.exception;

public class NullPointerEx {
    public static void main(String[] args) {

        String nome = null;

        try{
            var nulo = nome.length();
            System.out.println("Acessando um valor null: " + nulo);
          /*
          vc pode captura com Exception porque elas sao filhas de Exception
          mas Boas pratica é voce aproxima a Exception especifica no caso
          - NullPointerException
           */

        }catch (Exception e ){

            System.out.println("Voce esta Manipulando um valor Null! ");

        }finally {
            System.out.println("Sempre sera executado");
        }



    }
}

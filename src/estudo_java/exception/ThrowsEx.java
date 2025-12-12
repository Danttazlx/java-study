package estudo_java.exception;

public class ThrowsEx {


    public static int ExceptionEx(int aluno, int nota) throws ArithmeticException {

        return aluno / nota;

    }


    public static void main(String[] args) {

          try {

              ThrowsEx.ExceptionEx(10, 0);
              System.out.println("Dividindo por 0");

          } catch (ArithmeticException e) {
              throw new RuntimeException(e);
          }finally {
              System.out.println("Programa finalizado.");
          }



    }
}

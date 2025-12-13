package estudo_java.lambda;


import java.util.Arrays;
import java.util.List;

public class ExpressionLambda {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Dantas", "Eloah" , "Joaquim");

        nomes.forEach((nome) -> System.out.println("nome: " + nome));

  /*
   nomes   <- nome da lista
   forEach <- pra cada elemento faca algo
   (nome)  <- cada elemento eu vou chamar de nome
    sout   <- oque fazer com cada elemento

  */




    }
}

package javacore.exceptionfile;

public class RuntimeException02 {
    public static void main(String[] args) {

        abreConexao();

    }

    private static void abreConexao(){


        try {
            System.out.println("abrindo conexao");
            System.out.println("escrevendo dentro do banco ");
            throw new RuntimeException();
//            System.out.println("fechar conexao ");   esse bloco de cod nunca seria executado
        }catch (RuntimeException e){
            e.printStackTrace();
             throw e;
        }finally {
            System.out.println("fechando conexao com o banco");
        }



    }


}

package javacore.exception;

public class Error {
    public static void main(String[] args) {
        
        // error a JVM nao consegue se recuperar em tempo de Execucao
        recursividade();
    }

    public static void recursividade(){
        recursividade();

    }

}

package javacore.tryWithResource.domain;

public class Conecxao01 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("fechando Conecxao 01 ");
    }

}

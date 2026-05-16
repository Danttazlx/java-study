package javacore.exceptionfile;

import java.io.EOFException;
import java.sql.SQLException;

public class Multicatch {
    public static void main(String[] args) throws  EOFException {

//        try {
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//
//        }catch (ArithmeticException e){
//
//            e.printStackTrace();
//
//        }catch (IllegalArgumentException e){
//
//            e.printStackTrace();
//
//        }catch (RuntimeException e ){
//            System.out.println("dentro de runtimeException");
//            e.printStackTrace();

        try {
            testCatch();
        } catch (SQLException e) {
            System.out.println("dentro do index");

//        }catch (EOFException e){
//            System.out.println("EOFException");

        }finally {
            System.out.println("eaxecutando dentro do finally");
        }


    }


    private static void testCatch() throws SQLException, EOFException {

    }

}

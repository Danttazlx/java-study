package estudo_java.exception;

public class ArrayIndexEx {
    public static void main(String[] args) {

        /*
        int[] array = new int[]{1,2,3,4,5};

        System.out.println(array[5]);

        // esse codigo resulta em uma  exception
        // index errado

         */

        try {

            int[] array = new int[]{1,2,3,4,5};
            System.out.println(array[5]);



        }catch (ArrayIndexOutOfBoundsException e ){

                System.out.println("Exception: " + e.getMessage());

        }







    }
}

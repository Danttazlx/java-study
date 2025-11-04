package estudo_java.Swicth;

public class ExercicioSwicth02 {
    public static void main(String[] args) {

        int dayWeek = 4;


        /*

        usando o swicth legacy
        um jeito mais antigo de se fazaer porem comum

         */

        switch (dayWeek) {

            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terca");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");

            case 5:
                System.out.println("sexta");
                break;
            default:
                System.out.println("Numero invalido!!");
                break;

        }
    }
}

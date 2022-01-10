import java.util.Scanner;

    /* Napisać program służący do konwersji wartości temperatury podanej w stopniach
    Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
            Celsjusza + 32.0)*/


public class Project_1 {
    private static final double FAHENHEITA = 1.8;
    private static double CELSJUSZA = 0.0;
    private static final double CONSTANT_VALUE = 32.0;
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a value ");
        CELSJUSZA = input.nextDouble();
        double print = degreeCalculator(CELSJUSZA);
        System.out.println("Given value " + CELSJUSZA + " after change " + print);

    }

    private static double degreeCalculator(double value){
        double result;
        return result = FAHENHEITA * value + CONSTANT_VALUE;
    }



}

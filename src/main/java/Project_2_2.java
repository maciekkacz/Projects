import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
        najmniejszą z nich.*/
public class Project_2_2 {
    private static int sizeTable = 3;
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        fillNumbers();
        Integer max = Collections.max(numbers);
        System.out.println("Najwieksza liczba " + max);
        Integer min = Collections.min(numbers);
        System.out.println("Najmniejsza liczba " + min);


    }
    private static void fillNumbers(){
        for (int i = 0; i < sizeTable ; i++) {
            int number = input.nextInt();
            numbers.add(number);
        }
    }

}

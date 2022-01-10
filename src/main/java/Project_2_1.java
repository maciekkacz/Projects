
/*Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
        najmniejszą z nich.*/

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Project_2_1 {
    private static int size = 3;
    private static int[] date = new int[size];
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        fillTable();
        print(date);
        OptionalInt max = Arrays.stream(date).max();
        OptionalInt min = Arrays.stream(date).min();
        System.out.println();
        System.out.println("Najmniejsza liczba");
        System.out.println(max);
        System.out.println("Najwiszka liczba");
        System.out.println(min);

    }

    private static void fillTable(){
        for (int i = 0; i < size; i++) {
            int number = input.nextInt();
            date[i] = number;

        }
    }
    private static void print (int number[]){
        for (int i : number) {
            System.out.print(i + ": ");
        }
    }

}

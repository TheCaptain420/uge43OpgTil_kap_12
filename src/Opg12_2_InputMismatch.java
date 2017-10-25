
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Opg12_2_InputMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 5;
        int num3 = 5;
        int acsum = num1 + num3;
        int sum = 0;
        while (sum != acsum) {

            try { //"Prøver" dette
                System.out.println("What is the sum of " + num1 + " + " + num3);
                sum = input.nextInt();

            } catch (InputMismatchException ex) {//Men hvis der er en "InputMismatchException"/ forkert input, printer den dette.
                System.out.println("Fejl, du skal indtaste en int, prøv igen.");
                break;
            }

            if (sum == acsum) {
                System.out.println("True");
            } else {
                System.out.println("false");
            }
        }
    }
}


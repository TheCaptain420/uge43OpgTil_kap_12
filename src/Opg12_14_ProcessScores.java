import java.io.FileNotFoundException;
import java.util.Scanner;

public class Opg12_14_ProcessScores {
    public static void main(String[] args) throws FileNotFoundException {
        //Laver path til file (højre klik på fil og copy path)
        java.io.File file = new java.io.File("C:\\Users\\Mads\\IdeaProjects\\uge43OpgTil_kap_12\\Exercise12_14");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        //Laver variabler der skal bruges til at regne sum og avg.
        int i = 0;//I tæller hvor mange total tal der er.
        int sum = 0;

        while(input.hasNext()) {
            int k = input.nextInt(); // Sætter k til at være næste int
            System.out.println(k); // printer den
            sum += k; //Ligger den til sum
            i++;
        }
        //regner avg
        int avg = (sum/i);

        System.out.println("Sum is: " + sum + ". Avg is: "+ avg);

        //Lukker filen
        input.close();
    }
}

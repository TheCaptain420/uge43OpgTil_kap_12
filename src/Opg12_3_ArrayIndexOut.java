import java.util.*;
public class Opg12_3_ArrayIndexOut {
    public static void main(String[] args) {
        //Laver en array med 100.
        int testAr[] = new int[100];

        //Smider random tal ind i array
        for (int i= 0; i<100; i++) {
            testAr[i] = (int) (Math.random() * 100);
        }

        //Laver scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array Number you want: ");

        try {
            int inputerino = input.nextInt();
            System.out.println("The number inside the array is: "+ testAr[inputerino]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("(Out of Bounds) Failure, you need to type a number between 0 and 99");
        }
    }
}

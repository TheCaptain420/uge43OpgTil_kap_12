import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

import static java.util.Collections.sort;


public class Opg12_15_ReadWriteData {
    public static void main(String[] args) {
        //Laver en arrayList(Skal bruges til sort)
        ArrayList<Integer> list = new ArrayList<>();

        //Checker om den findes
        java.io.File file = new java.io.File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        //Laver filen
        try ( java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            //Printer tal ind i filen
            int i = 0;
            while (i<=100){
                int k;
                k = (int) (Math.random() * 100);
                output.print(k+" ");
                list.add(k);
                i++;

            }

        }
        //Hvis filen ikke findes..
        catch (FileNotFoundException e) { e.printStackTrace(); }

        //Sortere arraylisten
        sort(list);
        //printer den sorterede liste
        System.out.print("Sorted: ");
        System.out.println(list);



    }


}

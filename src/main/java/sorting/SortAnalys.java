package sorting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/15/2014.
 */
public class SortAnalys {


    public static void main(String[] args) throws FileNotFoundException {

        try {
            Scanner scanner = new Scanner(new FileInputStream("C://data.txt"));







            List<Integer> massive = new ArrayList<>();


            //int i = scanner.nextInt();
            while (scanner.hasNextInt() ) {
                int t= scanner.nextInt();
                massive.add(t);
                System.out.println(t);
            }

            massive.toArray();


           }








         catch (FileNotFoundException e){

             System.out.println("file not found");
         }

    }




}




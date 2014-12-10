/**
 * Created by a1 on! 12/9/2014.
 */


import java.util.*;
import java.util.ArrayList;


public class FirstClass {



    public static void distribution(){

        System.out.print("Insert raw"); //prints a string
        Scanner scanner = new Scanner(System.in);
        String rowLine = scanner.nextLine();
        int[][] mas  = new int[256][2];
        int row;
        for (int i = 0; i < rowLine.length(); i++)
        {
               row = Character.getNumericValue(rowLine.charAt(i));
               mas[row][1]++;    // =  mas[Character.getNumericValue(rowLine.charAt(i))][1] + 1;
        }

        for (int i = 0; i<256; i++){
            mas[i][0] = i;
            if (mas[i][1]!= 0){
            System.out.println(  (char)mas[i][0]  + " = " +  mas[i][1] );}
        }

    }


    public static void sumOfString(){
        System.out.print("Insert raw with numbers"); //prints a string
        Scanner scanner = new Scanner(System.in);
        String lLine = scanner.nextLine();
        List<Character> charsInList = new ArrayList<Character>();
        int sumOfNumsInString = 0;

        for (int i = 0; i < lLine.length(); i++) {
            if (Character.isDigit(lLine.charAt(i)))
                 {     charsInList.add(lLine.charAt(i));  }
        }

        for (Character t : charsInList) {
                sumOfNumsInString += Character.getNumericValue(t);
        }

        System.out.println( sumOfNumsInString );
        }





    public static void pypamid(){
        System.out.print("Insert pypamid height (VALUE > 0)"); //prints a string
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int spaces = height-1;
        int stars = 1;
        for (int rows = 1; rows <= height; rows++ ){

            for (int i = 1; i <= spaces; i++ ){
                System.out.print(" ");
            }
            for (int i=1; i<=stars; i++ ){
                System.out.print("*");
            }
            System.out.print("\n");
            stars+=2;
            spaces--;
        }




    }



    public static void leapLoop() throws Exception {
        while (true) {
            System.out.print("Insert year");
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            boolean leaping = checkLeap(year);
            System.out.print(leaping + "\n");
        }
    }

    public static boolean  checkLeap(int year){
        if (year < 1582){System.out.println("insert year > 1581");}
        if  (year%4 != 0)  return false;
        else
        if (year%100 != 0) return true;
        else
        if (year%400 != 0) return false;
        return true;
    }








    public static void main(String[] args) {

        //leapLoop();       //Leap year - task1
        //pypamid();        //Horizontal pyramid [Optional] - task3
        //sumOfString();    //Sum nums from a string[Optional] -task5
        distribution();      //    Character distribution -    task6


    }

}

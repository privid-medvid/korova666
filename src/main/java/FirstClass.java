/**
 * Created by a1 on! 12/9/2014.
 */


import java.util.*;


public class FirstClass {




    public static void sumOfString(){
        System.out.print("Insert raw with numbers"); //prints a string
        Scanner scanner = new Scanner(System.in);
        String lLine = scanner.nextLine();
        System.out.print(lLine);



    }



    public static void pypamid(){
        System.out.print("Insert pypamid height (VALUE > 0)"); //prints a string
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int spaces = height-1;
        int stars =1;
        for (int rows=1; rows<=height; rows++ ){

            for (int i=1; i<=spaces; i++ ){
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
        if (year < 1582){System.out.println("ââåäèòå ãîä áîëüøå 1581");}
        if  (year%4 != 0)  return false;
        else
        if (year%100 != 0) return true;
        else
        if (year%400 != 0) return false;
        return true;
    }








    public static void main(String[] args) {

        //leapLoop();
        //pypamid();
        sumOfString();



    }

}

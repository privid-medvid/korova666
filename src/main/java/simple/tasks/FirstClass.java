package simple.tasks; /**
 * Created by a1 on! 12/9/2014.
 */


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstClass {


    public static void calculiatr(){


        System.out.print("Insert raw" + "\n"); //prints a string
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        float result = 0;


        Pattern pat = Pattern.compile("(\\d+)([\\+\\-\\/\\*])(\\d+)");
        Matcher mat = pat.matcher(input);
        mat.find();

        String a = mat.group(1);
        String b = mat.group(3);
        String action = mat.group(2);

        switch (action)
        {
            case "+":
                result = Float.valueOf(a) + Float.valueOf(b);
                break;
            case "-":
                result = Float.valueOf(a) - Float.valueOf(b);
                break;
            case "*":
                result = Float.valueOf(a) * Float.valueOf(b);
                break;
            case "/":
                result = Float.valueOf(a) / Float.valueOf(b);
                break;
        }


            /*
        if (action.equals('+')) { result = Float.valueOf(a) + Float.valueOf(b);}
        if (action.equals('*')) {result = Float.valueOf(a) * Float.valueOf(b);}
        if (action.equals('/')) {result = Float.valueOf(a) / Float.valueOf(b);}
        if (action.equals('-')) {result = Float.valueOf(a) - Float.valueOf(b);}


              */



        System.out.println(  Float.toString(result)) ;

    }



    public static void distributionOnMap(){

        Map<Character, Integer> letters = new HashMap<Character, Integer>();
        System.out.print("Insert raw" + "\n"); //prints a string
        Scanner scanner = new Scanner(System.in);
        String rowLine = scanner.nextLine();
        Integer count;
        for (int i = 0; i < rowLine.length(); i++)
        {
            char key = rowLine.charAt(i);
            if (letters.containsKey(key) ){
                count = new Integer (letters.get(key) +1)   ;
                letters.put(key, count);
              }
            else  letters.put(key, 1);
        }
        System.out.println(letters.toString());
    }


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

    public static void main(String[] args) {

        pypamid();        //Horizontal pyramid [Optional] - task3
        //distribution();      //    Character distribution -    task6
        //distributionOnMap();      //    Character distribution -    task6
        //calculiatr();

    }

}

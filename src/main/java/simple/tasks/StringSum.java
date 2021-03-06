package simple.tasks;

import tasks.StringSumAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/19/2014
 */

public class StringSum implements StringSumAlgorithm {


    @Override
    public double getSumFromString(String s) {

            double sumOfNumsInString = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i)))
                {     sumOfNumsInString = sumOfNumsInString + Character.getNumericValue(s.charAt(i));  }
            }

            return sumOfNumsInString;
    }

    public static void main(String[] args) {

        System.out.print("Insert raw with numbers");
        Scanner scanner = new Scanner(System.in);
        String lLine = scanner.nextLine();
        StringSum Calc  = new StringSum();
        System.out.println( Calc.getSumFromString(lLine) );
    }
}

package simple.tasks;

import tasks.LeapYearAlgorithm;

import java.util.Scanner;

/**
 * Created by dshegera on 12/17/2014
 */

public class LeapYear implements LeapYearAlgorithm {

    final static int YEARACTUALFROM = 1581;

    public int yearRecieve() throws Exception {
        System.out.print("Insert year");
        Scanner scanner = new Scanner(System.in);
        return (scanner.nextInt());
    }


    public boolean isLeapYear(int year) {
        if (year < YEARACTUALFROM) {
            System.out.println("insert year > 1582" + "\n");
        }
        if (year % 4 != 0) return false;
        else if (year % 100 != 0) return true;
        else if (year % 400 != 0) return false;
        return true;
    }


    public static void main(String[] args) {

        LeapYear Year = new LeapYear();
        int year = 0;
        try {
            year = Year.yearRecieve();
        } catch (Exception E) {
            E.printStackTrace();
        }

        if (Year.isLeapYear(year)) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }

}
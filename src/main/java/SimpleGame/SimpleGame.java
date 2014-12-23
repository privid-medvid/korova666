package SimpleGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by dshegera on 12/22/2014
 */
public class SimpleGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Insert your number");

        int randNumber = rand.nextInt(1000);
        int scan = scanner.nextInt();


        while (randNumber != scan) {
            if (scan < randNumber) {
                System.out.println("Secret number is bigger");
            } else {
                System.out.println("Secret number is smaller");
            }
            scan = scanner.nextInt();
        }
        System.out.println("You WON!");
    }
}

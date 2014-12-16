package pairs.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/16/2014.
 */
public class PairsProblem {


    static List<Character> charsInList = new ArrayList<Character>();


    static boolean charIsBracket(char a) {

        if (a == '(' || a == ')' || a == '{' || a == '}' || a == '[' || a == ']') {
            return true;
        } else {
            return false;
        }
    }


    static boolean isReadyForReduction(char c, char d) {

        if (c == '(' && d == ')') {
            return true;
        }

        if (c == '[' && d == ']') {
            return true;
        }

        if (c == '{' && d == '}') {
            return true;
        }

        return false;
    }


    static boolean isWrong(char a, char b) {

        if (a == '(' && (b == ']' || b == '}')) return true;
        if (a == '[' && (b == ')' || b == '}')) return true;
        if (a == '{' && (b == ')' || b == ']')) return true;
        return false;
    }


    static boolean myArrayCheck() {


        if (charsInList.size() % 2 != 0) return false;
        do {

            for (int i = 0; i < (charsInList.size() - 1); i++) {


                if (isWrong(charsInList.get(i), charsInList.get(i + 1))) {
                    return false;
                }

                if (isReadyForReduction(charsInList.get(i), charsInList.get(i + 1))) {
                    charsInList.remove(i + 1);
                    charsInList.remove(i);
                }
            }

            if (charsInList.isEmpty()) {
                return true;
            }
        }
        while (true);
    }


    static void getLine() {
        System.out.print("Insert line With Brackets");
        Scanner scanner = new Scanner(System.in);
        String lineWithBrackets = scanner.nextLine();
        for (int i = 0; i < lineWithBrackets.length(); i++) {
            {
                if (charIsBracket(lineWithBrackets.charAt(i))) {
                    charsInList.add(lineWithBrackets.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {

        getLine();
        if (myArrayCheck()) {
            System.out.print("Expression is correct!");
        } else {
            System.out.print("Expression is NOT correct!" + '\n');
        }
    }
}


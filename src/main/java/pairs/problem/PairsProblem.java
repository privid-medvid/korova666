package pairs.problem;

import tasks.PairedBracketsAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/16/2014
 */
public class PairsProblem  implements PairedBracketsAlgorithm {



    boolean charIsBracket(char a) {

        if (a == '(' || a == ')' || a == '{' || a == '}' || a == '[' || a == ']') {
            return true;
        } else {
            return false;
        }
    }

    boolean isReadyForReduction(char c, char d) {

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

    boolean isWrong(char a, char b) {

        if (a == '(' && (b == ']' || b == '}')) return true;
        if (a == '[' && (b == ')' || b == '}')) return true;
        if (a == '{' && (b == ')' || b == ']')) return true;
        return false;
    }

    boolean closeOpenOrder(char a, char b) {

            if (a == ')' || b == '(') return true;
            if (a == ']' || b == '[') return true;
            if (a == '}' || b == '{') return true;

        return false;
    }

    public boolean checkExpressionCorrect(String var1) {

        List<Character> charsInList = new ArrayList<Character>();
        for (int i = 0; i < var1.length(); i++) {
            {
                if (charIsBracket(var1.charAt(i))) {
                    charsInList.add(var1.charAt(i));
                }
            }
        }

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

                if (charsInList.size() == 2){
                    if (closeOpenOrder(charsInList.get(0), charsInList.get(1))){
                        return false;}
                }
            }

            if (charsInList.isEmpty()) {
                return true;
            }
        }
        while (true);
    }

    public static void main(String[] args) {

        System.out.print("Insert line With Brackets");
        Scanner scanner = new Scanner(System.in);
        String lineWithBrackets = scanner.nextLine();
        PairedBracketsAlgorithm Pair = new PairsProblem();

        if (Pair.checkExpressionCorrect(lineWithBrackets)) {
            System.out.print("Expression is correct!");
        } else {
            System.out.print("Expression is NOT correct!" + '\n');
        }
    }
}


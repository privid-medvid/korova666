package subsequence;

import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/15/2014
 */

public class Subsequence {


    private static List<Character> superList = new ArrayList<Character>();
    private static List<Character> subList = new ArrayList<Character>();

    static void getSeqs() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert superRaw with numbers");
        String superSequence = scanner.nextLine();

        System.out.print("Insert subRaw with numbers");
        String subSequence = scanner.nextLine();

        for (int i = 0; i < superSequence.length(); i++) {
            if (Character.isDigit(superSequence.charAt(i))) {
                superList.add(superSequence.charAt(i));
            }
        }

        for (int i = 0; i < subSequence.length(); i++) {
            if (Character.isDigit(subSequence.charAt(i))) {
                subList.add(subSequence.charAt(i));
            }
        }
    }


    private static void algorythm() {
        int beginOfScanOfSup = 0;
        boolean ifWasSubSeq = false;

        for (Character sub : subList) {

            for (int i = beginOfScanOfSup; i < superList.size(); i++) {
                if (Character.getNumericValue(sub) == Character.getNumericValue(superList.get(i))) {
                    beginOfScanOfSup = i++;
                    ifWasSubSeq = true;
                    break;
                }
                ifWasSubSeq = false;
            }


            if (ifWasSubSeq == false) {
                break;
            }
        }

        if (ifWasSubSeq == true) {
            System.out.println("Yes, it is a subsequence");
        } else {
            System.out.println("BoolShit");
        }
    }


    public static void main(String[] args) {

        getSeqs();
        algorythm();

    }
}




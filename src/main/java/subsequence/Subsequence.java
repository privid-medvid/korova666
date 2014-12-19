package subsequence;


import tasks.SubSequenceAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dshegera on 12/15/2014
 */

public class Subsequence implements SubSequenceAlgorithm {

    @Override
    public boolean isSubSequence(List superList, List subList) {

        int beginOfScanOfSup = 0;
        boolean ifWasSubSeq = false;

        for (Object sub : subList) {
            for (int i = beginOfScanOfSup; i < superList.size(); i++) {

                  if (sub == superList.get(i)) {     //  if (Character.getNumericValue((Character)sub) == Character.getNumericValue((Character)superList.get(i))) {
                    beginOfScanOfSup = i;
                    ifWasSubSeq = true;
                    break;
                }
                ifWasSubSeq = false;
            }

            if (ifWasSubSeq == false) {
                break;
            }
        }
        return ifWasSubSeq;
    }

    public List<Integer> getSeqs() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert Raw with numbers");
        String superSequence = scanner.nextLine();
        List gotList = new ArrayList();

        for (int i = 0; i < superSequence.length(); i++) {
            if (Character.isDigit(superSequence.charAt(i))) {
                gotList.add(superSequence.charAt(i));
            }
        }
        return gotList;
    }

    public static void main(String[] args) {

        Subsequence Checker = new Subsequence();

        if (Checker.isSubSequence (Checker.getSeqs(), Checker.getSeqs()) ) {
            System.out.println("Yes, it is a subsequence");
        } else {
            System.out.println("BoolShit");
        }
    }
}

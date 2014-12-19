package simple.tasks;

import tasks.CharacterDistributionAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dshegera on 12/19/2014
 */

public class CharsDistribution implements CharacterDistributionAlgorithm {

    @Override
    public Map<Character, Integer> getDistribution(String s) {

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char row = s.charAt(i);
            if (myMap.containsKey(row)) {
                int count = myMap.get(row) + 1;
                myMap.put(row, count);

            } else {
                myMap.put(row, 1);
            }
        }

       return myMap;
    }
    public static void main(String[] args) {

        System.out.print("Insert raw");
        Scanner scanner = new Scanner(System.in);
        String rowLine = scanner.nextLine();
        CharsDistribution ChDistr = new CharsDistribution();
        Map<Character, Integer> insertedLineInMap = ChDistr.getDistribution(rowLine);
        System.out.println(insertedLineInMap);

    }
}
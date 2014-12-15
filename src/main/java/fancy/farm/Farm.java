package fancy.farm;

import java.util.*;

/**
 * Created by dshegera on 12/12/2014
 */
public class Farm {

    int maxSizeOfPlant = 10;
    private List<Plant> farmplace = new ArrayList<Plant>();

    public void recieveTree(Plant p) {

        if (farmplace.size() < maxSizeOfPlant) {

            farmplace.add(p);

        } else {
            System.out.println("no more place on farm");
        }

    }


    public void waterToAll() {

        for (Plant p : farmplace) {
            p.recieveWater();

        }

    }


}

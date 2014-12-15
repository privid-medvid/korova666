package fancy.farm;

import java.util.Random;

/**
 * // * Created by dshegera on 12/12/2014.
 * //
 */
public class Market {

    public Plant sellTree() {


        Random rn = new Random();
        switch (rn.nextInt(3)) {
            case 0:
                return new PlantPotato(5, true);
            case 1:
                return new PlantBanana(5, true);
            default:
                return new PlantCacao(2, false);
        }


    }

}


package fancy.farm;


/**
 * Created by dshegera on 12/12/2014
 */
public class FancyMain {


    public static void main(String[] args) {

        Farm farm = new Farm();
        Farmer farmer = new Farmer();

        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.recieveTree(farmer.buyTree());
        farm.waterToAll();
        farm.waterToAll();
        farm.waterToAll();
        farm.waterToAll();


    }


}

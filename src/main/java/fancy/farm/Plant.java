package fancy.farm;

/**
 * Created by dshegera on 12/15/2014.
 */
public class Plant {


    int weight = 0;
  //  String colour = "transparent";
    boolean harvestReadiness = false;
    private boolean watered;
    private int waterRecievedTimes = 0;

    public Plant(int weight, boolean watered) {
        this.weight = weight;
        this.watered = watered;
    }

    public void givesHarvest() {


        if (harvestReadiness) {
            System.out.println(this + " harvest got!");
            this.waterRecievedTimes = 0;
        } else {
            System.out.println(this + " harvest not appears");
        }

    }


    public void recieveWater() {

        if (this.watered) waterRecievedTimes++;
        else System.out.println(this + " cannot be watered");
        if (waterRecievedTimes > 3) harvestReadiness = true;
        givesHarvest();

    }

}

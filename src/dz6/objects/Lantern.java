package dz6.objects;

public class Lantern {

    int batteries;
    String lightWhite = "white";
    String lightRed = "red";
    boolean lightBlinking;


    // constructor
    Lantern(int batteriesMethod, String lightMethod, boolean shinesMethod){
        this.batteries = batteriesMethod;
        this.lightWhite = lightMethod;
        this.lightRed = lightMethod;
        this.lightBlinking = shinesMethod;
    }

}

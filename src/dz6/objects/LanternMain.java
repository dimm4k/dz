package dz6.objects;

public class LanternMain {
    public static void main(String[] args) {

        Lantern lantern1 = new Lantern(0, "white", false);

        lantern1.batteries = 3;


        if (lantern1.batteries == 1){
            System.out.println("Lantern is white" + lantern1.lightWhite);
        }
        if (lantern1.batteries == 2) {
            System.out.println("Lantern is red" + lantern1.lightRed);
        }
        if (lantern1.batteries == 3){
            lantern1.lightBlinking = true;
            System.out.println("Lantern is blinking" + lantern1.lightBlinking);
        }
        else{
            System.out.println("Insert batteries");
        }
    }
}

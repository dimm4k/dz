package dz1;

public class RoomRental {
    public static void main(String[] args) {
        int a = 40;
        int d = 2;
        int sum = (d * a);

        if (d >= 5){
            sum = sum - 20;
        }
        if (d >= 7){
            sum = sum - 50;
        }
        System.out.println(sum);

    }

}

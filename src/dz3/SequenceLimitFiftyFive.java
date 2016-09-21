package dz3;

public class SequenceLimitFiftyFive {
    public static void main(String[] args) {

        int[] array = new int[55];

        for (int i = 1; i < array.length; i = i + 2){
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}

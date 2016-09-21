package dz3;

public class SequenceOnlyPositive {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 90; i > 0; i = i - 5){
            array[i] = i;
            System.out.println(array[i]);
        }
    }
}

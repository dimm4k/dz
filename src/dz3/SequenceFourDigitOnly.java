package dz3;

public class SequenceFourDigitOnly {
    public static void main(String[] args) {


        int size = 9999;

        int[] array = new int[size];

        for (int i = 1000; i < array.length; i = i + 3){
            array[i] = i;
            System.out.println(array[i]);
            }
        }
    }
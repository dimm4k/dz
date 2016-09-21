package dz3;

public class SummNelementsOfArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 7, 1, 6, 0, 2, 9};

        int summ = 0;
        int number = array.length;

        for (int i = 0; i < number; i = i + 1){
            summ = summ + array[i];
        }
        System.out.println(summ);

    }
}

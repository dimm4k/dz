package dz3;

//	- Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class SequenceExponent {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 20; i++){
            a = a * 2;
            System.out.println(a);
        }
    }
}

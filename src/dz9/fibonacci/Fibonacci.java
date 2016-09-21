package dz9.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        int fibonacci = 5;

        for (int i = 0; i < fibonacci; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        System.out.println("The " + fibonacci + " number of fibonacci row is: " + temp);

    }
}

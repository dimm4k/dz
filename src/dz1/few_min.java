package dz1;

public class few_min {
    public static void main(String[] args) {

        short d = 2, e = 2, f = 64;

        System.out.println("Min is " + min(d, e, f));

    }

    public static int min(int a, int b, int c) {

        int res_min = 0;
        if (a <= b && a <= c) {
            res_min = a;
        } else if (b <= a && b <= c) {
            res_min = b;
        } else if (c <= a && c <= b) {
            res_min = c;
        }
        return res_min;

    }
}
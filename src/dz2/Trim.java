package dz2;

public class Trim {
    public static void main(String[] args) {

        /*
        String hello = "        hello world";
        //hello = hello.trim();
        hello.replace("world", "home");
        System.out.println(hello);
    }
    */

        /*

        int[] array = new int[5];
        for (int element : array) {
            System.out.println(element);
        }

        */

        boolean a, b, c;
        a = b = c = false;
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.println(a + ", " + b + ", " + c);

    }
}
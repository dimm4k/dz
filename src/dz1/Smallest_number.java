package dz1;

public class Smallest_number {

    public static void main(String[] args) {

        short d = 3, e = 5, f = 7, g = 11;

        System.out.println("Min is " + min(d,e,f,g));
    }

    public static int min(int a, int b, int c, int g){

        int result = 0;
        if(a < b && a < c && a < g){
            result = a;
        }
        else if(b < a && b < c && b < g){
            result = b;
        }
        else if(c < a && c < b && c < g){
            result = c;
        }
        else if(g < a && g < b && g < c){
            result = g;
        }
        return result;

    }
}

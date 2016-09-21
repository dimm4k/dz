package dz1;

public class min_max {
    public static void main(String[] args) {

        short d = 8, e = 16, f = 32;

        System.out.println("Min is " + min(d,e,f) + " and max is " + max(d,e,f));

    }

    public static int min(int a, int b, int c){

        int res_min = 0;
        if(a < b && a < c){
            res_min = a;
        }
        else if(b < a && b < c){
            res_min = b;
        }
        else if(c < a && c < b){
            res_min = c;
        }
        return res_min;

    }
    public static int max(int a, int b, int c){

        int res_max = 0;
        if(a > b && a > c){
            res_max = a;
        }
        else if(b > a && b > c){
            res_max = b;
        }
        else if(c > a && c > b){
            res_max = c;
        }
        return res_max;

    }

}
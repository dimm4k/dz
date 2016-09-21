package dz1;


public class closer_to_10 {
    public static void main(String[] args) {

        int a = 9;
        int b = 10;
        int c = 13;
        int res1;
        int res2;


        if (a > b){
            res1 = a - b;
        }else{
            res1 = b - a;
        }
        if (b > c){
            res2 = b - c;
        }else{
            res2 = c - b;
        }
        if (res1 < res2){
            System.out.println(a);
        }else{
            System.out.println(c);
        }


    }

}
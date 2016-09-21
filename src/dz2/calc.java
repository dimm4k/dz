package dz2;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {


        int res;
        String add = "addition";
        String sub = "subsctraction";
        String div = "division";
        String mul = "multiplication";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operation symbol: ");
        String operation = sc.next();

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();


        if (operation.equals(add)){

            res = first + second;
            System.out.println("The sum of the two numbers = " + res);
        }
        if (operation.equals(sub)){
            res = first - second;
            System.out.println("The result of the subsctraction = " + res);
        }
        if (operation.equals(div)){
            res = first / second;
            System.out.println("The result of the division = " + res);
        }
        if (operation.equals(mul)){
            res = first * second;
            System.out.println("The result of the multiplication = " + res);
        }


    }
}

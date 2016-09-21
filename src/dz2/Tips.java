package dz2;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {

        Float result;

        String ter = "terrible";
        String poo = "poor";
        String goo = "good";
        String gre = "great";
        String exc = "excellent";


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill amount : ");
        int amount = sc.nextInt();

        System.out.println("Enter service level: ");
        String operation = sc.next();

        Float pooPercent = (float)(amount / 100.0) * 5;
        Float gooPercent = (float)(amount / 100.0) * 10;
        Float grePercent = (float)(amount / 100.0) * 15;
        Float excPercent = (float)(amount / 100.0) * 20;


        if (operation.equals(poo)){
            result = amount + pooPercent;
            System.out.println("Total summ: " + result);
        }
        if (operation.equals(goo)){
            result = amount + gooPercent;
            System.out.println("Total summ: " + result);
        }
        if (operation.equals(gre)){
            result = amount + grePercent;
            System.out.println("Total summ: " + result);
        }
        if (operation.equals(exc)){
            result = amount + excPercent;
            System.out.println("Total summ: " + result);
        }if (operation.equals(ter)){
            System.out.println(amount);
        }


    }
}

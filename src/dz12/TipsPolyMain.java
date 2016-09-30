package dz12;

import java.util.Scanner;

public class TipsPolyMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter bill amount : ");
        Float enterAmount = sc.nextFloat();

        System.out.println("Enter service level (poor | good | excellent): ");
        String operation = sc.next();


        if (operation.equals("poor")) {

            TipsPolymorphism calculatePoor = new PoorTipsCount();
            Float result = calculatePoor.calculate(enterAmount);
            result = enterAmount + result;

            System.out.println("Service level is poor. Summ: " + result);
        }

        if (operation.equals("good")){

            TipsPolymorphism calculatorGood = new GoodTipsCount();
            Float result = calculatorGood.calculate(enterAmount);
            result = enterAmount + result;

            System.out.println("Service level is good. Summ: " + result);
        }

        if (operation.equals("excellent")){

            TipsPolymorphism calculateExcellent = new ExcellentTipsCount();
            Float result = calculateExcellent.calculate(enterAmount);
            result = enterAmount + result;

            System.out.println("Service level is excellent. Summ: " + result);
        }


    }
}

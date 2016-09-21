package dz1;

import java.util.Scanner;

public class even_uneven {

   public static void main(String[] args) {

       short a = 5;

       if ((a % 2) == 0){
           System.out.println(a);
       }
       else {
           System.out.println("This is not even number.");
       }


    }


/*

        public static void main(String args []) {
            int number;
            Scanner sr = new Scanner(System.in);
            System.out.print("Введите челое число -> ");
            if (sr.hasNextInt()) {
                number = sr.nextInt();
                if ((number % 2) == 0) {
                    System.out.print("Четное число " + number);
                } else {
                    System.out.print("Не четное число " + number);
                }
            } else {
                System.out.print("Вы ввели не целое число");
            }
        }
*/
}
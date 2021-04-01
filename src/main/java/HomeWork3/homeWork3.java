package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class homeWork3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int pop = 0;
        int chislo = numbers.nextInt(9);
        while (pop < 3) {
            System.out.print("вводи число - ");
            int number = input.nextInt();

            if (number > chislo) {
                System.out.println("Много");
            } else if (number < chislo) {
                System.out.println("Мало");
            } else if (number == chislo) {
                System.out.println("Угадал");
            }
            pop++;
        }
        System.out.print("Повторить?");

        String userData = input.next();
        if (userData.equals("1")) {
            main(null);
        }
    }
}
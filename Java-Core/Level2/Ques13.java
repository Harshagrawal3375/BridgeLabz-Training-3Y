package Level2;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number (less than 100): ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int counter = 100; // Start from 100 and go backwards

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--; // decrease counter
            }
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }

        sc.close();
    }
}

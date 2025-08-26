package Level2;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check for natural number (positive integer)
        if (number >= 1) {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a natural number (greater than 0).");
        }

        sc.close();
    }

}

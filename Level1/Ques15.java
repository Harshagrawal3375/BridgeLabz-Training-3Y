package Level1;

import java.util.Scanner;

public class Ques15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }
}

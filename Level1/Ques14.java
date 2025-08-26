package Level1;

import java.util.Scanner;

public class Ques14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }

}

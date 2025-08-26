package Level1;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // formula se
            int formulaSum = n * (n + 1) / 2;

            // while loop se
            int i = 1, loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using while loop = " + loopSum);
            System.out.println("Both results are same? " + (formulaSum == loopSum));
        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }
}

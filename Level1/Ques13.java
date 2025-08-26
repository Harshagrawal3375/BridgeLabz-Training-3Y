package Level1;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            // formula
            int formulaSum = n * (n + 1) / 2;

            // for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);
            System.out.println("Both results are same? " + (formulaSum == loopSum));
        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }   
}

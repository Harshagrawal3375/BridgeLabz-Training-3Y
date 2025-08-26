package Level1;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double num;

        System.out.print("Enter a number (0 to stop): ");
        num = sc.nextDouble();

        while (num != 0) {
            total += num;
            System.out.print("Enter another number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}

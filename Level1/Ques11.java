package Level1;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break; // loop se bahar niklo
            }
            total += num;
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }
}

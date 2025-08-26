package Level3;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Gregorian calendar check
        if (year >= 1582) {
            // ✅ Single if condition with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } else {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
        }

        sc.close();
    }
}

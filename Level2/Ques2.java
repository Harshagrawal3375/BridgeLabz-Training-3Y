package Level2;

import java.util.Scanner;

public class Ques2 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        // Input years of service
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Bonus condition
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
            System.out.println("Employee is eligible for bonus.");
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("Employee is not eligible for bonus (less than 5 years of service).");
        }

        sc.close();
    }
}

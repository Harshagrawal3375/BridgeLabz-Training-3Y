package Level2;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Amar
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        int heightAmar = sc.nextInt();

        // Taking input for Akbar
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = sc.nextInt();

        // Taking input for Anthony
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = sc.nextInt();

        // ---------------------------
        // Find youngest friend
        // ---------------------------
        String youngest = "Amar";
        int minAge = ageAmar;

        if (ageAkbar < minAge) {
            youngest = "Akbar";
            minAge = ageAkbar;
        }
        if (ageAnthony < minAge) {
            youngest = "Anthony";
            minAge = ageAnthony;
        }

       
        String tallest = "Amar";
        int maxHeight = heightAmar;

        if (heightAkbar > maxHeight) {
            tallest = "Akbar";
            maxHeight = heightAkbar;
        }
        if (heightAnthony > maxHeight) {
            tallest = "Anthony";
            maxHeight = heightAnthony;
        }

       
        System.out.println("The youngest friend is " + youngest + " with age " + minAge);
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight);

        sc.close();
    }
}

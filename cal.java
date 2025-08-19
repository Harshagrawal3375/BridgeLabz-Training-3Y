import java.util.Scanner;

public class cal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.");
        int num1 = sc.nextInt();
        System.out.println("Enter second no.");
        int num2 = sc.nextInt();
        int choice = sc.nextInt();
        double ans;
        switch(choice){
            case 1 :  
            ans = num1+num2;
            System.out.println(ans);
            break;

            case 2 :
            ans = num1-num2;
            System.out.println(ans);
            break;

            case 3 :
            ans = num1*num2;
            System.out.println(ans);
            break;

            case 4 :
            ans = num1/num2;
            System.out.println(ans);
            break;

            default : 
            System.out.println("Invalid Operator");
        }
    }
}

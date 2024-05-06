package homeworkWK4;

import java.util.Scanner;

public class Prog9Fibonacci {
    //Fibonacci series
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter num");
        int num = obj.nextInt();

        int num1 = 0, num2 = 1;
        System.out.println("Fibonacci series of" + num + "numbers:");
        for (int i = 1; i <= num; ++i) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}

package homeworkWK4;

import java.util.Scanner;

public class Prog4DigitSum {
    //sum of digits of given number
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        int number=obj.nextInt();
        int ans=sumDigits(number);
        System.out.println(ans);
    }
    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}


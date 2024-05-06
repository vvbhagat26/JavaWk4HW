package homeworkWK4;

import java.util.Scanner;

public class Prog5Palindromeno {
    //find if the number is palindrome or not
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int number = obj.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println("The number " + number + " is a palindrome.");
        } else {
            System.out.println("The number " + number + " is not a palindrome.");
        }
        obj.close();
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number=number /10;
        }
        return originalNumber == reversedNumber;
    }
}

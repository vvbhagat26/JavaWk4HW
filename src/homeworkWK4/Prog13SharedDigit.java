package homeworkWK4;

import java.util.Scanner;

public class Prog13SharedDigit {
    //find common digit betwwen two numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (between 10 and 99): ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number (between 10 and 99): ");
        int num2 = scanner.nextInt();
        scanner.close(); // Close the scanner to release resources

        boolean result = hasSharedDigit(num1, num2);

        if (result) {
            System.out.println("The numbers share at least one digit." + result);
        } else {
            System.out.println("The numbers do not share any digit." + result);
        }
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValidRange(num1) || !isValidRange(num2)) {
            return false; // Invalid input range
        }

        int digit1, digit2;
        while (num1 > 0) {
            digit1 = num1 % 10;
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                digit2 = tempNum2 % 10;
                if (digit1 == digit2) {
                    return true; // Found a shared digit
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
        }
        return false; // No shared digit found
    }

    public static boolean isValidRange(int number) {
        return number >= 10 && number <= 99;
    }
}




package homeworkWK4;

import java.util.Scanner;

public class Prog10ArmstrongNo {
    //find armstrong number
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter a number");
        int number = obj.nextInt();
        int originalNumber = number;
        int remainder, result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cube each digit
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}


package homeworkWK4;

import java.util.Scanner;

public class Prog2MaxMin {
    //find MAX and MIN from all input numbers

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                minNumber = Math.min(minNumber, number);
                maxNumber = Math.max(maxNumber, number);
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
        }
        System.out.println("Minimum number entered: " + minNumber);
        System.out.println("Maximum number entered: " + maxNumber);
        scanner.close();
    }
}






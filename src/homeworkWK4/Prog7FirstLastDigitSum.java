package homeworkWK4;

import java.util.Scanner;

public class Prog7FirstLastDigitSum {
    //find the sum of first and last digit of a given number
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number");
        int number = obj.nextInt();
        int result = sumFirstLastDigit(number);
        if (result ==-1) {
            System.out.println("invalid");
        } else {
            System.out.println(result);
        }
    }
        public static int sumFirstLastDigit(int number) {
            if(number<0){
                return -1;
            }

            // Convert the number to a string to extract digits
            String numStr = Integer.toString(number);

            // Check if the number has only one digit
            if (numStr.length() == 1) {
                return 2 * Character.getNumericValue(numStr.charAt(0)); // Sum of the same digit twice
            }

            // Extract the first and last digits
            int firstDigit = Character.getNumericValue(numStr.charAt(0));
            int lastDigit = Character.getNumericValue(numStr.charAt(numStr.length() - 1));

            // Calculate the sum
            int totalSum = firstDigit + lastDigit;
            return totalSum;

        }
    }


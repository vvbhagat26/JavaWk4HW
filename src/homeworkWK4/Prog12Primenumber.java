package homeworkWK4;

import java.util.Scanner;

public class Prog12Primenumber {
    //prime number
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();
        obj.close();
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int num) {
        if (num < 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by i, not prime
            }
        }
        return true;
    }
}

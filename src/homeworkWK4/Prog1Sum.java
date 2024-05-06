package homeworkWK4;

import java.util.Scanner;

public class Prog1Sum {
//sum for all input numbers

    public static void main(String[] args) {  //use hasnext() method
        Scanner scanner = new Scanner(System.in);
        int totalNumbers = 10;
        int sum = 0;
        int i = 1;
        while (i <= totalNumbers) {
            System.out.print("Enter number :" + i);
            if(scanner.hasNext()){
            int number = scanner.nextInt();
            sum = sum + number;
            i++;
        }else {
                System.out.println("Invalid no.");
            }
        System.out.println("Sum of the entered numbers: " + sum);
        //scanner.close();
    }
}}




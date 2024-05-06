package homeworkWK4;

import java.util.Scanner;

public class Prog14PatternDiamond {
    //Print diamond

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter noOfRaws");
        int noOfRaws = obj.nextInt();
        obj.close();
        int spaces = noOfRaws - 1;
        int stars = 1;

        //print upper half diamond
        int i = 1;
        while (i <= noOfRaws) {
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            spaces--;
            stars += 2;
            i++;
        }
        // Print the lower half of the diamond
        spaces = 1;
        stars = noOfRaws * 2 - 3;
        i = 1;
        while (i <= noOfRaws- 1) {
            int j = 1;
            while (j <= spaces) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= stars) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            spaces++;
            stars -= 2;
            i++;
        }

    }
}

package homeworkWK4;

import java.util.Scanner;

public class Prog15LeftAngleTri {
    //Print left angle triangle
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter no. of raws");
        int noOfRaws= obj.nextInt();
        obj.close();
        for(int i=1;i<=noOfRaws;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

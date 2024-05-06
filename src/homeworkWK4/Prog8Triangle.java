package homeworkWK4;

import java.util.Scanner;

public class Prog8Triangle {
    //Print pattern
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter noOfRaws");
        int noOfRaws= obj.nextInt();

        for(int i=1;i<=noOfRaws;i++){
            for(int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}

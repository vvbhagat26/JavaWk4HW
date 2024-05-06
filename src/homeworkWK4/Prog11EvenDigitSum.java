package homeworkWK4;

import java.util.Scanner;

public class Prog11EvenDigitSum {
    //add only even digits of a given input
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number");
        int number= obj.nextInt();
        int ans=getEvenDigitSum(number);
        if(ans==-1) {
            System.out.println("Invalid input");
        }else{
            System.out.println("sum of even digits "+ ans);
        }
    }
    public static int getEvenDigitSum(int number) {
    if(number<0){
        return -1;
    }
    int sum=0;
    while (number>0){
        int digit=number%10;
        if(digit%2==0){
            sum=sum+digit;
        }
        number=number/10;
    }
    return sum;
    }
    }


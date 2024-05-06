package homeworkWK4;

import java.util.Scanner;

public class Prog3VowelConsonant {
    //find an alphabet is vowel or not.

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a single character");
        String ch = obj.nextLine();

        if (ch.length() != 1) {
            System.out.println("Invalid input");
        } else {
            char c = ch.charAt(0);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); //convert to lowercase
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println("The character is a vowel.");
                } else {
                    System.out.println("The character is a consonant.");
                }
            } else {
                System.out.println("Invalid input! Please enter a letter.");
            }
        }

    }
}


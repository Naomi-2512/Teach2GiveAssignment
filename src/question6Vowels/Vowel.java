package question6Vowels;

import java.util.Scanner;

public class Vowel {
    //Write a program that counts the number of vowels in a sentence.
    public static void main(String[] args) {

        final String vowels = "aeiou";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message:");
        String message = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < message.length(); i++) {

            char character = message.charAt(i);

            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == character)
                    count += 1;
            }

        }
        System.out.println(count);
    }

}


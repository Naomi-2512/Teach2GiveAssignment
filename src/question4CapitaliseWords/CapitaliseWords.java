package question4CapitaliseWords;

import java.util.Scanner;

public class CapitaliseWords {
    /*Write a program that accepts a string as input, capitalizes the first letter of each word in the
string, and then returns the result string.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message:");
        String message = scanner.nextLine().trim();

        StringBuilder finalMessage;
        finalMessage = new StringBuilder(Character.toUpperCase(message.charAt(0)) + "");

        for (int i = 1; i < message.length(); i++) {


            char character = message.charAt(i);

            if (character == ' ') {
                finalMessage.append(message.charAt(i));
                message = message.replace(message.charAt(i+1), Character.toUpperCase(message.charAt(i+1)));
                continue;
            }
            finalMessage.append(character);
        }

        System.out.println(finalMessage);

    }
}


package question5ReverseInteger;

import java.util.Scanner;

public class ReverseInteger {
    /*Write a program that takes an integer as input and returns an integer with reversed digit
    ordering. */
    String number1;
    int number;
    StringBuilder reverse;
    public ReverseInteger(int number){
        this.number = number;

        number1 = String.valueOf(number);
        reverse = new StringBuilder(" ");

        if (number1.charAt(0)=='-'){
            reverse.append(number1.charAt(0));
            number1 = number1.replace(number1.charAt(0), ' ').trim();
            returnReverse();
        }
        else {
            returnReverse();
        }
        String num = String.valueOf(reverse).trim();
        int finalNumber = Integer.parseInt(num);
        System.out.println(finalNumber);

    }
    public void returnReverse(){
        for (int i =number1.length()-1;i>=0; i-- ){
           char c = number1.charAt(i);
           reverse.append(c);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int myNumber = scanner.nextInt();

        new ReverseInteger(myNumber);
    }
}

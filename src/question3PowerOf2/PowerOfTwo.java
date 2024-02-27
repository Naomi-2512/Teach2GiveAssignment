package question3PowerOf2;

import java.util.Scanner;

public class PowerOfTwo {
   // Write a program that takes an integer as input and returns true if the input is a power of two.
    public static void main(String[]args){
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        float number = scanner.nextInt();
        if (number == 0){
            System.out.println("false");
        }
        else if (number == 1) {
            System.out.println("true");
        }
        else{
            if (number % 2 != 0){
                System.out.println("false");
            }
            else {
                while (true){
                    result = number/2;
                    if (result == 1){

                        System.out.println("true");

                    }
                    else if (result < 1){
                        System.out.println("false");
                    }
                    else if (result>1) {
                        number = result;
                        continue;
                    }
                    break;

                }
            }
        }
    }
}

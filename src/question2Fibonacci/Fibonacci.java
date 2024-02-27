package question2Fibonacci;

public class Fibonacci {
    //Write a program to generate the Fibonacci sequence up to 100.
    public static void main(String[]args){
        int y = 0;
        int z = 1;
        System.out.print(y + ",");
        System.out.print(z+ ",");
        while (y + z <= 100){
            int sum = y + z;
            System.out.print(sum + ",");
            y = z;
            z = sum;
        }
    }
}

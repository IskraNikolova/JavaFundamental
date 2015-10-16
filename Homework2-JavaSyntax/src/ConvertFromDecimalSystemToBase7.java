import java.util.Scanner;

/*
Write a program that takes an integer number and converts it to base-7
 */

public class ConvertFromDecimalSystemToBase7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write decimal number:");
        int decimalNumber = input.nextInt();
        System.out.printf("%s", Integer.toString(decimalNumber, 7));
    }
}

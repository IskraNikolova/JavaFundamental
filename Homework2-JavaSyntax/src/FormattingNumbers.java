import java.util.Scanner;
/*
Write a program that reads 3 numbers: an integer a (0 ? a ? 500), a floating-point b and a floating-point c
 and prints them in 4 virtual columns on the console. Each column should have a width of 10 characters.
 The number a should be printed in hexadecimal, left aligned; then the number a should be printed in binary form,
  padded with zeroes, then the number b should be printed with 2 digits after the decimal point, right aligned;
  the number c should be printed with 3 digits after the decimal point, left aligned.
 */
public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.printf(String.format("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|",Integer.toHexString(a), Integer.toBinaryString(a), b, c));
    }
}

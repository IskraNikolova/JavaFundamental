import java.util.Scanner;
/*
Write a program that converts from a base-7 number to its decimal representation

 */
public class ConvertFromBase7ToDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write a base-7 number: ");
        String base7Number = input.nextLine();

        System.out.println(Integer.valueOf(base7Number, 7));
    }
}

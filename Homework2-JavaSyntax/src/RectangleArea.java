import java.util.Scanner;
/*
Write a program that enters the sides of a rectangle (two integers a and b)
and calculates and prints the rectangle's area.
 */
public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Write a and b: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int rectangleArea =  a*b;

        System.out.printf("Rectangle area is: %d%n", rectangleArea);
    }
}

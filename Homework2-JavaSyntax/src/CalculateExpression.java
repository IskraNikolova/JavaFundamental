import java.util.Scanner;

/*
Write a program that reads three floating point numbers from the console and calculates their result with the following formulae:
((a2 + b2) / (a2 – b2))(a + b + c) / ?c             (a2 + b2 - c3)(a – b)
Then calculate the difference between the average of the three numbers and the average of the two formulae. Average (a, b, c)
 – Average (f1, f2)
 */

public class CalculateExpression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double sqrtOfC = Math.sqrt(c);
        double sumOfNumbers = a + b + c;
        double powNum = sumOfNumbers/sqrtOfC;
        double f1 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2)), powNum);

        double powNum2 = a - b;
        double f2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2)) - Math.pow(c, 3), powNum2);

        double avarageOfABC = (a + b + c)/3;
        double avarageF1F2 = (f1 + f2)/2;

        double diff =Math.abs(avarageOfABC - avarageF1F2);

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f\n", f1, f2, diff);
    }
}

import java.util.Scanner;

public class GetAvarage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a, b and c:");
        double a =  input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double avg = getAvarage(a, b, c);
        System.out.printf("Avarage is: %.2f%n", avg);
    }

    public static double getAvarage(double a, double b, double c) {
        double avarage = (a + b + c)/3;
        return avarage;
    }
}

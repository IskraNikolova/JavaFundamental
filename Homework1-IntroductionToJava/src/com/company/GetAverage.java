package com.company;
import java.util.Scanner;

/*
Create a method that finds the average of three numbers. Read in internet about java methods.
Check the naming conventions. Invoke your method and test it. Format the output to two digits after the decimal separator.
The placeholder is %.2f
 */
public class GetAverage {

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
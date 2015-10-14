package com.company;
import java.util.Scanner;

/*
 Create a Java program that reads a number N from the console and
 calculates the sum of all numbers from 1 to N (inclusive).
 */
public class SumNumbersFrom1ToN {

    public static void main(String[] args) {

        System.out.print("Write n: ");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= inputNumber; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

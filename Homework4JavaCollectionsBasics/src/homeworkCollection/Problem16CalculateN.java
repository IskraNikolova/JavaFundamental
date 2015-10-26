package homeworkCollection;

import java.util.Scanner;

/*
Write a program that recursively calculates factorial.

 */

public class Problem16CalculateN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        System.out.println(calculateFactorial(number));
    }

    private static long calculateFactorial(long number){
        long result;
        if(number == 0 || number == 1){
            return 1;
        }

        result = calculateFactorial(number - 1) * number;
        return result;
    }
}

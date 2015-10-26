package homeworkCollection;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program to enter a number n and n integer numbers and sort and print them.
Keep the numbers in array of integers: int[].
 */

public class Problem1SortArrayOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] collection = new int[count];
        for (int i = 0; i < count; i++) {
            collection[i] = input.nextInt();
        }
        Arrays.sort(collection);

        for (int i = 0; i < count; i++) {
            System.out.print(collection[i] + " ");
        }
    }
}

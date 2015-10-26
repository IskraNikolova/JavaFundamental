package homeworkCollection;

import java.util.Scanner;

/*
Write a program to count the number of words in given sentence.
Use any non-letter character as word separator.
 */

public class Problem5CountAllWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();
        String[] arrayStr = input.split("[\\W]+");
        System.out.println(arrayStr.length);
    }
}

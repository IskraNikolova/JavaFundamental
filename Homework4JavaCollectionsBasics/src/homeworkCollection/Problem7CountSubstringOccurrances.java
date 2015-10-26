package homeworkCollection;

import java.util.Scanner;
/*
Write a program to find how many times given string appears in given text as substring.
The text is given at the first input line. The search string is given at the second input line.
The output is an integer number. Please ignore the character casing.
 */
public class Problem7CountSubstringOccurrances {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String occurrences = scanner.nextLine().toLowerCase();

        int diff = occurrences.length() - 1;
        int count = 0;
        for (int i = 0; i < input.length() - diff; i++) {
            String substringForCheck = input.substring(i, occurrences.length() + i);
            if(substringForCheck.equals(occurrences)){
                count++;
            }
        }
        System.out.println(count);
    }
}

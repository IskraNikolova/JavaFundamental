package homeworkCollection;

import java.util.Scanner;
import java.util.TreeSet;
/*
At the first line at the console you are given a piece of text. Extract all words from it and print them in alphabetical order.
Consider each non-letter character as word separator. Take the repeating words only once.
Ignore the character casing. Print the result words in a single line, separated by spaces.
 */
public class Problem10ExtractAllUniqueWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] arrays = input.split("[\\W]+");

        TreeSet<String> uniqueWords = new TreeSet<>();
        for (int i = 0; i < arrays.length; i++) {
            uniqueWords.add(arrays[i] + " ");
        }
        uniqueWords.stream().forEach(System.out :: print);
    }
}

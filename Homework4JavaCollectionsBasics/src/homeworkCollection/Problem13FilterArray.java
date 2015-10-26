package homeworkCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that filters an array of strings,
leaving only the strings with length greater than 3 characters. Use .filter()
 */

public class Problem13FilterArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split("[\\W]+");

        ArrayList<String> listWord = new ArrayList<>(Arrays.asList(words));
        listWord.stream().filter(a -> a.length() > 3).forEach(g -> System.out.printf(g + " "));
    }
}

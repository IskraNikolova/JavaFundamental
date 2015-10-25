import java.util.Scanner;

/*
Write a program to find how many times a word appears in given text. The text is given at the first input line.
The target word is given at the second input line. The output is an integer number.
 Please ignore the character casing. Consider that any non-letter character is a word separator.
 */

public class Problem6CountSpesifiedWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrays = input.split("[\\W]+");
        String specifiedWord = scanner.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < arrays.length; i++) {

            if(arrays[i].toLowerCase().equals(specifiedWord)) {
                count++;
            }

        }
        System.out.println(count);
    }
}

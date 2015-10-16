import java.util.Scanner;

/*
Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols
long and consist only of English alphabet letters. Use regex.
 */

public class ExtractWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String clear = text.replaceAll("[^a-zA-Z]", " ");
        System.out.println(clear);
    }
}

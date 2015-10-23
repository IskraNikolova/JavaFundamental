import java.util.Scanner;

/*
Write a program that enters an array of strings and finds in it all sequences of equal elements.
The input strings are given as a single line, separated by a space.
 */

public class Problem2SequencesOfEqualString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] collection = input.split(" ");
        for (int i = 0; i < collection.length; i++) {

            if(i < collection.length - 1 && collection[i].equals(collection[i + 1])){
                System.out.printf("%s ", collection[i]);
            } else {
                System.out.printf("%s \n", collection[i]);
            }
        }

    }
}

package homeworkCollection;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program that enters an array of strings and finds in it the largest sequence of equal elements.
If several sequences have the same longest length, print the leftmost of them. The input strings are given
as a single line, separated by a space.
 */

public class Problem3LargestSequenceOfEqualString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrays = input.split(" ");

        ArrayList<String> collection = new ArrayList<>();
        int largestCount = 0;
        ArrayList<String>  lCollection = new ArrayList<>();

        for (int i = 0; i < arrays.length; i++) {
            if(i < arrays.length - 1 &&  arrays[i].equals(arrays[i + 1])){
                collection.add(arrays[i]);
            } else {
                collection.add(arrays[i]);
                if(largestCount < collection.size()) {
                    largestCount = collection.size();
                    lCollection.clear();
                    for (int j = 0; j < largestCount; j++) {

                        lCollection.add(collection.get(j));
                    }
                }
                collection.clear();
            }
        }

        for (int i = 0; i < lCollection.size(); i++) {
            System.out.print(lCollection.get(i) + " ");
        }

    }
}

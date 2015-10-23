import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program to find all increasing sequences inside an array of integers.
The integers are given in a single line, separated by a space. Print the sequences in the order
 of their appearance in the input array, each at a single line. Separate the sequence elements by a space.
  Find also the longest increasing sequence and print it at the last line. If several sequences have the same
   longest length, print the leftmost of them.
 */

public class Problem3LongestSequencesOfEqualString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrays = input.split(" ");
        int[] intArr = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            intArr[i] = Integer.parseInt(arrays[i]);
        }

        ArrayList<Integer> collection = new ArrayList<>();
        int largestCount = 0;
        ArrayList<Integer>  lCollection = new ArrayList<>();

        for (int i = 0; i < intArr.length; i++) {
            if(i < intArr.length - 1 &&  intArr[i] < intArr[i + 1]){
                System.out.print(intArr[i] + " ");
                collection.add(intArr[i]);
            } else {
                collection.add(intArr[i]);
                if(largestCount < collection.size()) {
                    largestCount = collection.size();
                    lCollection.clear();
                    for (int j = 0; j < largestCount; j++) {

                        lCollection.add(collection.get(j));
                    }
                }
                collection.clear();
                System.out.println(intArr[i]);
            }
        }
        System.out.print("Longest: ");
        for (int i = 0; i < lCollection.size(); i++) {
            System.out.print(lCollection.get(i) + " ");
        }
    }
}

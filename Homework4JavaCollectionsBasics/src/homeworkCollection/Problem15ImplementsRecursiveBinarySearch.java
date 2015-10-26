package homeworkCollection;

import java.util.Scanner;

/*
Binary search is an algorithm that works on already sorted arrays.
Basically, it goes to the middle element and checks it has to continue searching
 to the left, or to the right. Return the index of the element, or -1, if the element is not found.
 */

public class Problem15ImplementsRecursiveBinarySearch{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        String[] arr = line.split(" ");
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }
        int index = recursiveBinarySearch(arr1, 0, arr1.length, number);
        System.out.println(index);

    }
    public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);

            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end , key);

            } else {
                return mid;
            }
        }
        return -1;
    }
}


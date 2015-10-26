package homeworkCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Use the .sorted() method to sort an array of integers.
 The first line of input is the array. The second is the sorting order.
 */

public class Problem14SortArrayWithStreamAPI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split(" ");

        ArrayList<Integer> sortedList =  new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            sortedList.add(num);
        }
        String commands = scanner.nextLine();
        if(commands.equals("Ascending")){
            sortedList.stream().sorted().forEach(s -> System.out.printf(s + " "));
        } else if(commands.equals("Descending")){
            Collections.sort(sortedList, Collections.reverseOrder());
            sortedList.forEach(s -> System.out.printf(s + " "));
        }

    }
}

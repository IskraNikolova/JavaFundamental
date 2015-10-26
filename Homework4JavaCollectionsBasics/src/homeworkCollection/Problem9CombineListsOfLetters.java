package homeworkCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem9CombineListsOfLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String[] firstArrays = firstString.split(" ");
        ArrayList<String> list =  new ArrayList<>(Arrays.asList(firstArrays));

        String secondString = scanner.nextLine();
        String[] secondArrays = secondString.split(" ");
        boolean isEqual = false;
        for (int i = 0; i < secondArrays.length; i++) {
            for (int j = 0; j < firstArrays.length; j++) {
                if(secondArrays[i].equals(firstArrays[j])) {
                    isEqual = true;
                }
            }
            if(isEqual == false){
                list.add(secondArrays[i]);
            }
            isEqual = false;
        }
        for (String symbol : list) {
            System.out.print(symbol + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

/*
You are given an array of integers as a single line, separated by a space.
Write a program that checks consecutive pairs and prints if both are odd/even or not.
Note that the array length should also be an even number
 */

public class OddAndEvenPairs {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] clear = str.split("\\s");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < clear.length; i++) {
            int num = Integer.parseInt(clear[i]);
            list.add(num);
        }
        if(list.size() % 2 != 0) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 0; i < list.size(); i = i + 2) {
                int firstDigit = list.get(i);
                int secondNumber = list.get(i + 1);
                if ((firstDigit % 2 == 0 && secondNumber % 2 != 0) || (firstDigit % 2 != 0 && secondNumber % 2 == 0)) {
                    System.out.printf("%1$d, %2$d -> different\n", firstDigit, secondNumber);
                } else if (firstDigit % 2 == 0 && secondNumber % 2 == 0) {
                    System.out.printf("%1$d, %2$d -> both are even\n", firstDigit, secondNumber);
                } else if (firstDigit % 2 != 0 && secondNumber % 2 != 0) {
                    System.out.printf("%1$d, %2$d -> both are odd\n", firstDigit, secondNumber);
                }
            }
        }
    }
}


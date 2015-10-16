import java.util.*;

/*
Write a program that takes as input two integers N and M, and randomizes the numbers between them.
 Note that M may be smaller than or equal to N.
 */

public class RandomizeNumbersFromMToN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int max = Math.max(n, m);
        int min = Math.min(n,m);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}

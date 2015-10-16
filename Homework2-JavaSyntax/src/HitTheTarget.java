import java.util.Scanner;

/*
Write a program that takes as input an integer – the target – and outputs to the console all pairs of numbers between
1 and 20, which, if added or subtracted, result in the target.
 */

public class HitTheTarget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(i + j == num) {
                    System.out.printf("%d + %d = %d\n", i, j, num);
                }
            }
        }
        for (int i = 20; i >= 0; i--){
            for (int j = 20; j >= 0; j--){
                if(i - j == num) {
                    System.out.printf("%d - %d = %d\n", i, j, num);
                }
            }
        }
    }
}

package examProblems;

import java.util.Scanner;

public class Problem1StuckNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = new String[input];
        for (int i = 0; i < input; i++) {
            int n = scanner.nextInt();
            numbers[i] = Integer.toString(n);
        }
        boolean check = false;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                for (int k = 0; k < input; k++) {
                    for (int l = 0; l < input; l++) {
                        if (numbers[i] != numbers[j] && numbers[i] != numbers[k] &&
                                numbers[i] != numbers[l] && numbers[j] != numbers[k] &&
                                numbers[j] != numbers[l] && numbers[k] != numbers[l]) {
                            if ((numbers[i] + numbers[j]).equals((numbers[k] + numbers[l]))) {
                                System.out.printf("%s|%s==%s|%s\n", numbers[i], numbers[j], numbers[k], numbers[l]);
                                check = true;
                            }
                        }
                    }
                }
            }
        }
        if(!check){
            System.out.println("No");
        }
    }
}

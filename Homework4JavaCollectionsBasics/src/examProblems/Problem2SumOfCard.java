package examProblems;

import java.util.Scanner;

public class Problem2SumOfCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] cards = str.split(" ");

        for (int i = 0; i < cards.length; i++) {
            String value = cards[i].substring(0, cards[i].length() - 1);
            cards[i] = value;
        }
        boolean hasEquals = false;
        int sum = 0;
        int sumOfEqualsNumber = 0;
        for (int i = 0; i < cards.length; i++) {
            int num = getNumber(cards[i]);
            if (i < cards.length - 1 && cards[i].equals(cards[i + 1])) {
                sumOfEqualsNumber += num;
                hasEquals = true;
            } else {
                if (sumOfEqualsNumber > 0) {
                    sumOfEqualsNumber += num;
                    sumOfEqualsNumber *= 2;
                    sum += sumOfEqualsNumber;
                    if (hasEquals == true) {
                        sumOfEqualsNumber = 0;
                    }
                } else {
                    sum += num;
                }
            }
        }
        System.out.println(sum);
    }
    private static int getNumber(String str){
        int number = 0;
        switch (str){
            case "2":
                number = 2;
                break;
            case "3":
                number = 3;
                break;
            case "4":
                number = 4;
                break;
            case "5":
                number = 5;
                break;
            case "6":
                number = 6;
                break;
            case "7":
                number = 7;
                break;
            case "8":
                number = 8;
                break;
            case "9":
                number = 9;
                break;
            case "10":
                number = 10;
                break;
            case "J":
                number = 12;
                break;
            case "Q":
                number = 13;
                break;
            case "K":
                number = 14;
                break;
            case "A":
                number = 15;
                break;
        }
        return number;
    }
}

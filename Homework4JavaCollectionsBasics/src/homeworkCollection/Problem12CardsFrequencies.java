package homeworkCollection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem12CardsFrequencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split(" ");
        int numOfAllCards = input.length;


        Map<String, Integer> linkMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            String cardFace = input[i].substring(0, input[i].length() - 1);
            if(!linkMap.containsKey(cardFace)) {
                linkMap.put(cardFace, 0);
            }

            linkMap.put(cardFace, linkMap.get(cardFace) + 1);
        }

        for (Map.Entry<String, Integer> card : linkMap.entrySet()) {
            double percentage = ((double)card.getValue() / numOfAllCards) * 100;
            System.out.printf("%s -> %.2f%%\n", card.getKey(), percentage);
        }
    }
}
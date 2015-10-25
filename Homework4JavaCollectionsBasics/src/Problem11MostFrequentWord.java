import java.util.*;

/*
Write a program to find the most frequent word in a text and print it, as well as how many times
it appears in format "word -> count". Consider any non-letter character as a word separator.
Ignore the character casing. If several words have the same maximal frequency,
print all of them in alphabetical order.
 */

public class Problem11MostFrequentWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split("[\\W]+");

        TreeMap<String, Integer> wordsCount = new TreeMap<>();

        for (String word : words) {
            Integer count = wordsCount.get(word);
            if(count == null){
                count = 0;
            }
            wordsCount.put(word, count + 1);
        }

        wordsCount.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        int maxValueInMap = (Collections.max(wordsCount.values()));

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue()==maxValueInMap) {
                System.out.printf("%s -> %s times\n",entry.getKey(), entry.getValue());
            }
        }
    }
}

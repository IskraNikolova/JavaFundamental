
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeirdScript {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        int number;
        if(Character.isDigit(in.charAt(0))) {
            number = Integer.parseInt(in);
            char charForKey = '\0';
            if ((number / 26) % 2 == 0 || ((number - 1) / 26) % 2 != 0 && number % 26 == 0) {
                int result;
                if (number % 26 == 0) {
                    result = 90;
                } else {
                    result = (number % 26) + 96;
                }
                charForKey = (char) result;
            } else if ((number / 26) % 2 != 0 || ((number - 1) / 26) % 2 == 0 && number % 26 == 0) {
                int result;
                if (number % 26 == 0) {
                    result = 122;
                } else {
                    result = (number % 26) + 64;
                }
                charForKey = (char) result;
            }
            String key = String.format("%1$c%1$c", charForKey);
            String input = scanner.nextLine();

            StringBuilder allText = new StringBuilder();
            while (!input.equals("End")) {
                allText.append(input);
                input = scanner.nextLine();
            }

            String result = allText.toString();
            String patternStr = key + "(.*?)" + key;
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(result);
            while (matcher.find()) {
                if(matcher.group(1).length() > 0) {
                    System.out.println(matcher.group(1));
                }
            }
        }
    }
}

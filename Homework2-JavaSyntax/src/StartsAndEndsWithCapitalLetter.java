import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a program that takes as input an array of strings are prints only the words that start and end with capital letter.
 * Words are only strings that consist of English alphabet letters. Use regex.
 */
public class StartsAndEndsWithCapitalLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()){
            String word = input.next();
            Pattern pattern =  Pattern.compile("[A-Z]\\w*[A-Z]");
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}

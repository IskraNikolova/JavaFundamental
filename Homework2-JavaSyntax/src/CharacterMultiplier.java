import java.util.Scanner;

/*
Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum). Then continue with the next two characters.
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
 */

public class CharacterMultiplier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();
        characterMultiply(first, second);
    }
    public static void characterMultiply(String first, String second){
        int max = Math.max(first.length(), second.length());
        int min = Math.min(first.length(), second.length());
        int sum = 0;
        int m = 1;
        for (int i = 0; i < max; i++) {
            if(i < min) {
                m = (int)first.charAt(i) * (int)second.charAt(i);
            } else if(first.length() == max && i >= min){
                m = (int)first.charAt(i);
            } else if(second.length() == max && i >= min){
                m = (int)second.charAt(i);
            }
            sum += m;
        }
        System.out.println(sum);
    }
}

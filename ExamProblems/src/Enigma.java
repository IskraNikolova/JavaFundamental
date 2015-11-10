
import java.util.Scanner;

public class Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
         scanner.nextLine();
        int count = 0;

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            String[] arrWords = input.split(" ");
            for (int j = 0; j < arrWords.length; j++) {
                for (int k = 0; k < arrWords[j].length(); k++) {
                    if(!Character.isDigit(arrWords[j].charAt(k))){
                        count++;
                    }
                }
            }

            for (int j = 0; j < arrWords.length; j++) {
                arrWords[j] = decryptingWord(arrWords[j], count);
            }
            count = 0;
            printArray(arrWords);
            System.out.println();
        }

    }
    public static String decryptingWord(String word, int count){
        int division = count/2;
        String wordResult = "";
        for (int i = 0; i < word.length(); i++) {
            if(!Character.isDigit(word.charAt(i))){
                int c = (word.charAt(i)  + division);
                char charAppend =  (char) c;
                wordResult += charAppend;
            } else{
                wordResult += word.charAt(i);
            }
        }
        return wordResult;
    }
    public static void printArray(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s ", arr[i]);
        }
    }
}

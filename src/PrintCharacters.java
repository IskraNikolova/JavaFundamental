
public class PrintCharacters {
    public static void main(String[] args) {
        char symbol = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(symbol++ + " ");
        }
    }
}

import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();

        for (int i = 1; i <= inputNumber; i++){
            char ch = 'a';
            for (int j = 0; j < i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        for(int i = inputNumber - 1; i > 0; i--){
            char ch = 'a';
            for(int j = 0; j < i; j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}

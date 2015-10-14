package com.company;
import java.util.Scanner;

/*
Create a triangle of characters, based on input.
Learn about java.util.Scanner and Integer.parseInt ().
 Test your program with integers up to 26.
 */
public class PrintACharacterTriangle {

    public static void main(String[] args) {

        System.out.print("Write n: ");
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

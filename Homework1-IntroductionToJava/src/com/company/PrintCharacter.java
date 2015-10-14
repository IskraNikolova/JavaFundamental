package com.company;
/*
Print the characters from ‘a’ to ‘z’ on the console on a single line, separated by a space.
 Use a for-loop. Note: you can directly declare and increment char in the for-loop. for (char c = ‘a’; …)
*/
public class PrintCharacter {

    public static void main(String[] args) {

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%c ", c);
        }
    }
}

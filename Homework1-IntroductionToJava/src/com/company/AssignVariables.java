package com.company;

/*Find suitable types for variables. You are given the following types: byte, short, int, long,
char, boolean, float, double, and String.
Assign the following values to them false, “Palo Alto, CA”, 32767,
2000000000, 0.1234567891011, 0.5f, 919827112351L, 127, ‘c’.
*/
public class AssignVariables {

    public static void main(String[] args) {

        boolean bool = false;
        String str = "Palo Alto, CA";
        short shortNumber = 32_767;
        int intNumber = 2_000_000_000;
        double doubleNumber = 0.1234567891011;
        float floatNumber = 0.5f;
        long longNumber = 919_827_112_351L;
        byte byteNumber = 127;
        char charC = 'c';

        System.out.println(bool + "\n" + str + "\n" + shortNumber + "\n"
                + intNumber + "\n" + doubleNumber + "\n" + floatNumber
                + "\n" + longNumber + "\n" + byteNumber + "\n" + charC);
    }
}

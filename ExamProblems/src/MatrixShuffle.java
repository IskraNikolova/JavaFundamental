import java.util.Scanner;

public class MatrixShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        char[] text = new char[size * size];
        for (int i = 0; i < (size * size); i++) {
            if (i < input.length()) {
                text[i] = input.charAt(i);
            } else {
                text[i] = ' ';
            }
        }
        char[][] result = getSpiralArray(size, text);
        StringBuilder oddChar = new StringBuilder();
        StringBuilder evenChar = new StringBuilder();

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if(row%2 == 0) {
                    if (col % 2 == 0) {
                        String str = result[row][col] + "";
                        oddChar.append(str);
                    } else {
                        String str1 = result[row][col] + "";
                        evenChar.append(str1);
                    }
                }else{
                    if (col % 2 != 0) {
                        String str = result[row][col] + "";
                        oddChar.append(str);
                    } else {
                        String str1 = result[row][col] + "";
                        evenChar.append(str1);
                    }
                }
            }
        }
        String strResult = oddChar.toString() + evenChar.toString();
        String result1 = strResult.replaceAll(" ", "");
        String result2 = new StringBuilder(result1).reverse().toString().toLowerCase();

        if(result2.equals(result1.toLowerCase())){
            System.out.printf("<div style='background-color:#4FE000'>%s</div>", strResult);
        }else {
            System.out.printf("<div style='background-color:#E0000F'>%s</div>", strResult);
        }


    }
        public static char[][] getSpiralArray(int dimension, char[] input) {
        char[][] spiralArray = new char[dimension][dimension];

        int numConcentricSquares = (int) Math.ceil((dimension) / 2.0);

        int j;
        int sideLen = dimension;
        int index = 0;
        for (int i = 0; i < numConcentricSquares; i++) {
            // do top side
            for (j = 0; j < sideLen; j++) {
                spiralArray[i][i + j] = input[index++];
            }

            // do right side
            for (j = 1; j < sideLen; j++) {
                spiralArray[i + j][dimension - 1 - i] = input[index++];
            }

            // do bottom side
            for (j = sideLen - 2; j > -1; j--) {
                spiralArray[dimension - 1 - i][i + j] = input[index++];
            }

            // do left side
            for (j = sideLen - 2; j > 0; j--) {
                spiralArray[i + j][i] = input[index++];
            }

            sideLen -= 2;
        }

        return spiralArray;
    }

}


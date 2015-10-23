import java.io.*;

/*
Write a program that reads a text file and prints on the console the sum of the ASCII symbols of each of its lines.
 Use BufferedReader in combination with FileReader.
 */

public class Problem1SumLines {

    public static void main(String[] args) {
        try( BufferedReader bfr = new BufferedReader
                ( new FileReader
                        ( new File ("resources/lines.txt")))) {
            String str;
            while ((str = bfr.readLine()) != null){
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    sum += str.charAt(i);
                }
                System.out.println(sum);
            }

        }
        catch (FileNotFoundException fnf){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

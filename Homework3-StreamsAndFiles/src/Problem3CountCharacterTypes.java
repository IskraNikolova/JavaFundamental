import java.io.*;
import java.util.ArrayList;

public class Problem3CountCharacterTypes {

    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        try( BufferedReader bfr = new BufferedReader
                ( new FileReader
                        ( new File("resources/words.txt")))

        ) {
            ArrayList<String> list = new ArrayList<>();
            String str;
            while ((str = bfr.readLine()) != null){
                list.add(str);
            }
            int vowels = 0;
            int consonants = 0;
            int punctuation = 0;
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    boolean isletterOrDigit = Character.isLetterOrDigit(list.get(i).charAt(j));
                    boolean isWhiteSpace = Character.isWhitespace(list.get(i).charAt(j));

                    if(isWhiteSpace){
                        continue;
                    }
                    if(!isletterOrDigit){
                        punctuation++;

                    } else {
                        switch (list.get(i).charAt(j)){
                            case 'a':
                                vowels++;
                                break;
                            case 'e':
                                vowels++;
                                break;
                            case 'i':
                                vowels++;
                                break;
                            case 'o':
                                vowels++;
                                break;
                            case 'u':
                                vowels++;
                                break;
                            default:
                                consonants++;
                                break;
                        }
                    }
                }
                String vow = "Vowels: " + vowels;
                String cons = "Consonants: " + consonants;
                String punc = "Punctuation: " + punctuation;

                listStr.add(vow);
                listStr.add(cons);
                listStr.add(punc);
            }
        } catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bfw = new BufferedWriter(
                new FileWriter(
                        new File("resources/count-chars.txt")))) {

            for (String line : listStr) {

                bfw.write(line + "\n");
            }

        }catch (IOException e) {
                e.printStackTrace();
        }
    }
}

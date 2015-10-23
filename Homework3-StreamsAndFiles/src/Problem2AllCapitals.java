import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem2AllCapitals {

    public static void main(String[] args) {
        String line;
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("resources/lines.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("File error 1");
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("resources/lines.txt"))) {
            for (String s : lines) {
                pw.write(new String(s.toUpperCase()) + "\n");
            }

        } catch (FileNotFoundException fnf) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Problem5SaveAnArrayListOfDoubles {

    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>(){{
            add(5.0);
            add(5.9);
            add(9.0);
            add(6.5);
        }};

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/doubles.list")))){
             oos.writeObject(list);
            }
        catch (IOException io){
            System.err.print(io.toString());
        }
    }
}

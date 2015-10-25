import java.util.ArrayList;
import java.util.Scanner;

public class GetFirstOddOrEvenElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String numbers = input.nextLine();
        String[] clearNum = numbers.split("\\s");
        String commands = input.nextLine();
        String[] getCommandWord = commands.split("\\s");
        int count = Integer.parseInt(getCommandWord[1]);
        String oddOrEven = getCommandWord[2];

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < clearNum.length; i++) {
            int number = Integer.parseInt(clearNum[i]);
            num.add(number);
        }
        if(oddOrEven.equals("odd")){

            getFirstOdd(num, count);
        } else {
            getFirstEven(num, count);
        }

    }
    public static void getFirstOdd(ArrayList<Integer> collection, int count){
        int counter = 0;
        for (int i = 0; i < collection.size(); i++) {
            if(counter == count){
                return;
            }
            if(collection.get(i)%2 != 0){
                System.out.print(collection.get(i) + " ");
                counter++;
            }
        }
    }

    public static void getFirstEven(ArrayList<Integer> collection, int count){
        int counter = 0;
        for (int i = 0; i < collection.size(); i++) {
            if(counter == count){
                return;
            }
            if(collection.get(i)%2 == 0){
                System.out.print(collection.get(i) + " ");
                counter++;
            }
        }
    }
}

package examProblems;

import java.util.Scanner;

public class Problem3GandalfSStash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mood = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine().toLowerCase();
        String[] input = str.split("[\\W\\_]+");
        for (int i = 0; i < input.length; i++) {
            int point = calculatePoints(input[i]);
            mood += point;
        }
        System.out.println(mood);
        System.out.println(moodsRezult(mood));
    }
    private static int calculatePoints(String input){
        int points = 0;
        switch (input){
            case "cram":
                points += 2;
                break;
            case "lembas":
                points += 3;
                break;
            case "apple":
                points++;
                break;
            case "melon":
                points++;
                break;
            case "honeycake":
                points += 5;
                break;
            case "mushrooms":
                points -= 10;
                break;
            default:
                points--;
                break;
        }
        return points;
    }
    private static String moodsRezult(int points){
        String mood ="";
        if(points < -5){
            mood = "Angry";
        }else if(points >= -5 && points < 0){
            mood = "Sad";
        }else if(points >= 0 && points < 15){
            mood = "Happy";
        }else if(points >= 15){
            mood = "Special JavaScript mood";
        }
        return mood;
    }
}

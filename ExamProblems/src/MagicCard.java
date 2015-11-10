import java.util.Scanner;

public class MagicCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String handOfCards = scanner.nextLine();
        String oddOrEven = scanner.nextLine();
        String magicCard = scanner.nextLine();

        int sum = 0;
        String[] cards = handOfCards.split(" ");
        for (int i = 0; i < cards.length; i++) {
            if(oddOrEven.equals("odd")){
                if(i % 2 != 0){
                    int number = takeTheNumber(cards[i]);
                    if(isValueEqual(cards[i], magicCard)){
                        number = number * 3;
                    }
                    if(isSuitEqual(cards[i], magicCard)){
                        number = number *2;
                    }
                    sum += number;
                }
            }else{
                if(i % 2 == 0){
                    int number = takeTheNumber(cards[i]);
                    if(isValueEqual(cards[i], magicCard)){
                        number = number * 3;
                    }
                    if(isSuitEqual(cards[i], magicCard)){
                        number = number *2;
                    }
                    sum += number;
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isValueEqual(String card, String magicCard){
        boolean isEqualValue = false;
        int index = card.length() - 1;
        int indexMagic = magicCard.length() - 1;
        String cardValues = card.substring(0, index);
        String magicValue = magicCard.substring(0, indexMagic);
        if(cardValues.equals(magicValue)) {
            isEqualValue = true;
        }
        return isEqualValue;
    }

    public static boolean isSuitEqual(String card, String magicCard){
        boolean isEqualSuit = false;
        int index = card.length() - 1;
        int indexMagic = magicCard.length() - 1;
        char magicCardSuit = magicCard.charAt(indexMagic);
        String res1 = magicCardSuit +"";
        char cardSuit = card.charAt(index);
        String res2 = cardSuit +"";
        if(res1.equals(res2)){
            isEqualSuit = true;
        }
        return isEqualSuit;
    }
    public static int takeTheNumber(String str){
        int value = 0;
        int index = str.length() - 1;
        String cardValues = str.substring(0, index);
        switch (cardValues){
            case "2":
                value = 20;
                break;
            case "3":
                value = 30;
                break;
            case "4":
                value = 40;
                break;
            case "5":
                value = 50;
                break;
            case "6":
                value = 60;
                break;
            case "7":
                value = 70;
                break;
            case "8":
                value = 80;
                break;
            case "9":
                value = 90;
                break;
            case "10":
                value = 100;
                break;
            case "J":
                value = 120;
                break;
            case "Q":
                value = 130;
                break;
            case "K":
                value = 140;
                break;
            case "A":
                value = 150;
                break;
        }
        return value;
    }
}

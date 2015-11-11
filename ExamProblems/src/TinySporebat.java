import java.util.Scanner;

public class TinySporebat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 5800;
        int glowcaps = 0;
        int countOfGlowcaps = 30;
        int bonus = 200;
        String input = scanner.nextLine();

        while (!input.equals("Sporeggar")) {
            String lastChar = input.substring(input.length() - 1, input.length());
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) != 'L') {
                    health -= input.charAt(i);
                    if(health <= 0){
                        System.out.printf("Died. Glowcaps: %d%n", glowcaps);
                        return;
                    }
                } else {
                  health += bonus;
                }
            }
            glowcaps += Integer.parseInt(lastChar);
            input = scanner.nextLine();
        }

        if (health > 0) {
            System.out.printf("Health left: %d%n", health);
            if (glowcaps >= countOfGlowcaps) {
                int remain = glowcaps - countOfGlowcaps;
                System.out.printf("Bought the sporebat. Glowcaps left: %d%n", remain);
            } else if (countOfGlowcaps > glowcaps) {
                int remain = countOfGlowcaps - glowcaps;
                System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.%n", remain);
            }
        }
    }
}

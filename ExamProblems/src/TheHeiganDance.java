import java.util.Scanner;

public class TheHeiganDance {

    public static void main(String[] args) {
        int playerHelth = 18500;
        double heiganHealth = 3_000_000;
        Scanner scanner = new Scanner(System.in);
        Double playerDamage = Double.parseDouble(scanner.nextLine());
        String lastSpell = "";


        int playerRow = 15 >> 1;
        int playerCol = 15 >> 1;

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            if(lastSpell.equals("Cloud")){
                heiganHealth -= playerDamage;
                playerHelth -= 3500;
            }

            if(heiganHealth <= 0 || playerHelth <= 0){
                break;
            }
            if(!lastSpell.equals("Cloud")){
                heiganHealth -= playerDamage;
                if(heiganHealth <= 0){
                    break;
                }
            }
            lastSpell = "Eruption";


            String spellName = tokens[0];
            int damageRow = Integer.parseInt(tokens[1]);
            int damageCol = Integer.parseInt(tokens[2]);

            int movePlayerRow = playerRow;
            int movePlayerCol = playerCol;

            if(isInDamageArea(damageRow, damageCol, movePlayerRow, movePlayerCol)) {
                movePlayerRow = playerRow - 1;
                if (isInDamageArea(damageRow, damageCol, movePlayerRow, movePlayerCol) ||
                        isNextMoveWall(movePlayerRow, movePlayerCol)) {
                    movePlayerRow = playerRow;
                    movePlayerCol = playerCol + 1;
                    if (isInDamageArea(damageRow, damageCol, movePlayerRow, movePlayerCol) ||
                            isNextMoveWall(movePlayerRow, movePlayerCol)) {
                        movePlayerRow = playerRow + 1;
                        movePlayerCol = playerCol;
                        if (isInDamageArea(damageRow, damageCol, movePlayerRow, movePlayerCol) ||
                                isNextMoveWall(movePlayerRow, movePlayerCol)) {
                            movePlayerRow = playerRow;
                            movePlayerCol = playerCol - 1;
                            if (isInDamageArea(damageRow, damageCol, movePlayerRow, movePlayerCol) ||
                                    isNextMoveWall(movePlayerRow, movePlayerCol)) {
                                if (spellName.equals("Cloud")) {
                                    playerHelth -= 3500;
                                } else {
                                    playerHelth -= 6000;
                                }
                                lastSpell = spellName;
                            } else {
                                playerCol--;
                            }
                        } else {
                            playerRow++;
                        }
                    } else {
                        playerCol++;
                    }
                } else {
                    playerRow--;
                }
            }
        }
        if(heiganHealth <= 0){
            System.out.println("Heigan: Defeated!");
        }else{
            System.out.printf("Heigan: %.2f%n", heiganHealth);
        }

        if(playerHelth <= 0){
            System.out.println("Player: Killed by " + (lastSpell.equals("Cloud")? "Plague Cloud": lastSpell));
        }else {
            System.out.println("Player: " + playerHelth);
        }

        System.out.println("Final position: " + playerRow + ", " + playerCol);
    }

    static boolean isInDamageArea(int damageRow, int damageCol, int plRow, int plCol){
        for (int row = damageRow - 1; row <= damageRow + 1; row++) {
            for (int col = damageCol - 1; col <= damageCol + 1; col++) {
                if(plRow == row && plCol == col){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isNextMoveWall(int playerX, int playerY){
        return playerX < 0 || playerX >= 15 || playerY < 0 || playerY >= 15 ? true : false;
    }
}

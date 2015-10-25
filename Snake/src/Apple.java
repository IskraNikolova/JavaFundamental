import java.awt.*;
import java.util.Random;

public class Apple {
    private Random random;
    private Box appleBox;

    public Apple(){
        appleBox = createNewApple(Game.snake);
    }
    private Box createNewApple(Snake s) {
        random = new Random();
        int x = random.nextInt(Game.COLS);
        int y = random.nextInt(Game.ROWS);
        Box b = new Box(x, y);

        if (s.body.contains(b)) {
            return createNewApple(s);
        }
        return b;
    }

    public void drawApple(Graphics g){
        int boxSize = appleBox.BOX_SIZE;
        g.setColor(Color.red);
        g.fillOval(appleBox.x*boxSize, appleBox.y*boxSize,
                   boxSize, boxSize);
    }

    public Box getAppleBox(){
        return appleBox;
    }
}

import java.awt.*;
import java.util.Collections;
import java.util.LinkedList;

public class Snake {
    public static LinkedList<Box> body;
    public Box head;

    private int velX, velY;

    public Snake(){
        body = new LinkedList<>();
        Collections.addAll(body,
                new Box(1, 2),
                new Box(2, 2),
                new Box(3, 2),
                new Box(4, 2)
        );
        head = body.peekLast();
        velX = 1;
        velY = 0;
    }

    public void drawSnake(Graphics g){
        for (Box box : body) {
            //Draws the body of the box
            g.setColor(Color.CYAN);
            g.fillRect(box.x*box.BOX_SIZE, box.y*box.BOX_SIZE,
                    box.BOX_SIZE, box.BOX_SIZE);

            //Draws the border of the each box
            g.setColor(Color.black);
            g.drawRect(box.x*box.BOX_SIZE, box.y*box.BOX_SIZE,
                    box.BOX_SIZE, box.BOX_SIZE);
        }
    }

    public void tick(){
        head = body.peekLast();
        Box nextPosition = new Box(head.x + velX, head.y + velY);

        boolean outOfBounds = nextPosition.x >= Game.COLS || nextPosition.x < 0 ||
                              nextPosition.y >= Game.ROWS || nextPosition.y < 0;

        if(nextPosition.equals(Game.apple.getAppleBox())){
            Game.score += 10;
            body.add(Game.apple.getAppleBox());
            Game.apple = new Apple();
            Game.changeSpeed();
        }else if(body.contains(nextPosition)){
            Game.gameRunning = false;
        } else if(outOfBounds){
            nextPosition = changeSnakeBox();
        }

        for (int i = 0; i < body.size() - 1; i++){
            body.set(i, body.get(i + 1));
        }
        body.set(body.size() - 1, nextPosition);
    }
    private Box changeSnakeBox(){
        Box nextPos = new Box(0, 0);
        if(velX == 1 && velY == 0){
            nextPos  = new Box(0, head.y);
        } else if(velX == -1 && velY == 0){
            nextPos  = new Box(Game.COLS - 1, head.y);
        } else if(velX == 0 && velY == 1) {
            nextPos = new Box(head.x, 0);
        } else if(velX == 0 && velY == -1) {
            nextPos = new Box(head.x, Game.ROWS - 1);
        }
            return nextPos;
    }

    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }

    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }
}

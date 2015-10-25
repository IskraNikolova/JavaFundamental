import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener{

    public InputHandler(Game game){
        game.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP) {
            if(Game.snake.getVelY() != 1){
                Game.snake.setVelX(0);
                Game.snake.setVelY(-1);
            }
        } else if (keyCode == KeyEvent.VK_DOWN) {
            if(Game.snake.getVelY() != -1) {
                Game.snake.setVelX(0);
                Game.snake.setVelY(1);
            }
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            if(Game.snake.getVelX() != -1) {
                Game.snake.setVelX(1);
                Game.snake.setVelY(0);
            }
        } else if (keyCode == KeyEvent.VK_LEFT) {
            if(Game.snake.getVelX() != 1) {
                Game.snake.setVelX(-1);
                Game.snake.setVelY(0);
            }
        }
        if(keyCode == KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}

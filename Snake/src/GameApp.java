import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("serial")
public class GameApp extends Applet{
    private Game game;
    InputHandler iHandler;

    public void init(){
        game = new Game();
        game.setBackground(Color.yellow);
        game.setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT + 25));
        game.setVisible(true);
        game.setFocusable(true);
        this.add(game);
        this.setVisible(true);
        iHandler = new InputHandler(game);
    }

    public void paint(Graphics g) {
        this.setSize(new Dimension(800, 650));
    }
}

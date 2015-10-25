import java.awt.*;

public class Game extends Canvas implements Runnable{
    public static final int ROWS = 30;
    public static final int COLS = 30;
    public static final int SIZE = 20;
    public static final int WIDTH = COLS*SIZE;
    public static final int HEIGHT = ROWS*SIZE;

    public static Snake snake;
    public static Apple apple;

    private Thread runThread;
    public static Graphics globalGraphics;
    public static int threadSpeed;
    public static int score;

    static boolean gameRunning = false;

    public void paint(Graphics g){
        globalGraphics = g.create();

        if(runThread == null){
            runThread = new Thread(this);
            runThread.start();
            gameRunning = true;
        }
    }

    public Game(){
        snake = new Snake();
        apple = new Apple();
        score = 0;
        threadSpeed = 200;
    }

    public void render(Graphics g){
        g.clearRect(0, 0, WIDTH, HEIGHT);
        snake.drawSnake(globalGraphics);
        apple.drawApple(globalGraphics);
        this.drawScore(g);
    }

    public void run(){
        while (gameRunning){
            snake.tick();
            render(globalGraphics);
            try {
                Thread.sleep(threadSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.drawDeath(globalGraphics);
    }
    public static void changeSpeed(){
        if(score % 50 == 0){
            threadSpeed -= 10;
        }
    }

    public void drawScore(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, Game.HEIGHT, Game.WIDTH, 25);
        g.setColor(Color.green);
        g.drawString("score = "+ score, 10, Game.WIDTH+ 15);
    }

    private void drawDeath(Graphics g){
        g.setColor(Color.red);
        g.drawString("YOU DEAD!!!", Game.WIDTH/2, Game.HEIGHT/2);
    }
}

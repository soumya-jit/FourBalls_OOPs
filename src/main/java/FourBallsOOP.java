import processing.core.PApplet;

public class FourBallsOOP extends PApplet {

    public static Window window = new Window(640, 500);
    public static Ball[] balls = new Ball[4];

    public static void main(String[] args) {
        PApplet.main("FourBallsOOP", args);
        for(int ball = 1; ball <= 4; ball++)
        {
            balls[ball-1] = new Ball(10, 0, (int)(window.getHeight() * ((float)ball / 5)), ball);
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(window.getWidth(), window.getHeight());
    }

    @Override
    public void draw() {
        for(int ball = 1; ball <= 4; ball++)
        {
            ellipse(balls[ball-1].getX(), balls[ball-1].getY(), balls[ball-1].getDiameter(), balls[ball-1].getDiameter());
            balls[ball-1].moveRight();
        }
    }

}

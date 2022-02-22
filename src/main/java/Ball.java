public class Ball {
    private int diameter = 10;
    private int x;
    public int y;
    private int speed;

    Ball(int diameter, int x, int y, int speed)
    {
        this.diameter = diameter;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void moveRight()
    {
        this.x += this.speed;
    }
}

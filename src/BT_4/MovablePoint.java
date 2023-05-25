package BT_4;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "X: " + getX()
                + " Y: " + getY()
                + " xSpeed: " + getxSpeed()
                + " ySpeed: " + getySpeed();
    }

    @Override
    public void moveUp() {
        this.ySpeed -= this.y;
    }

    @Override
    public void moveDown() {
        this.ySpeed += this.y;
    }

    @Override
    public void moveLeft() {
        this.xSpeed -= this.x;
    }

    @Override
    public void moveRight() {
        this.xSpeed += this.x;
    }
}

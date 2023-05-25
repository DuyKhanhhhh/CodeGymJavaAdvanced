package BT_4;

public class MovableCircle extends MovablePoint implements Movable{
    protected int radius;
    public MovableCircle(){}
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return super.toString()
                + "radius" + getRadius();
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

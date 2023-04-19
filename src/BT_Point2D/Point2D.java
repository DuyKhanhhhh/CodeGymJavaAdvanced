package BT_Point2D;

public class Point2D {
    public float x;
    public float y;
    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public float [] XY = new float[2];
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.XY[0] = x;
        this.XY[1] = y;
    }
    public float [] getXY(){
        return this.XY;
    }
    public String toString(){
        return "X: " + getX()
                + " Y: " + getY()
                + " XY: " + getXY();
    }
}

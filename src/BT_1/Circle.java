package BT_1;

public class Circle extends Shape{
    protected double radius = 1.0;
    public Circle(){}
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }
    public String toString(){
        return super.toString()
                + " Radius:  " + getRadius();
    }
}

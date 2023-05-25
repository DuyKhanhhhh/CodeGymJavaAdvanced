package BT_2;

public class Circle implements GeometricObject{
    public double radius;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Radius: " + getRadius();
    }
    @Override
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }
}

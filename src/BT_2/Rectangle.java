package BT_2;

public class Rectangle implements GeometricObject{
    public double width;
    public double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return super.toString()
                + " Width: " + getWidth()
                + " Length: " + getLength();
    }
    @Override
    public double getArea(){
        return this.width * this.length;
    }
    @Override
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
}

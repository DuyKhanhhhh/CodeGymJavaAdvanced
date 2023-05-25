package BT_1;

public class test {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes [0] = new Circle();
        shapes [1] = new Rectangle();
        shapes [2] = new Square();
        for (Shape s: shapes) {
            System.out.println(s.getArea());
        }
    }
}

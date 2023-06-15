package Cau1;

import java.io.Serializable;

public class RollRoyce extends Car implements Serializable {
    private int width;
    private int height;
    private int weight;
    private int price;
    public RollRoyce(){
        super();
    }
    public RollRoyce(String carName,String color, String engine, int width, int height, int weight, int price){
        super(carName, color, engine);
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width = " + width +
                " ,height = " + height +
                " ,weight = " + weight +
                " ,price = " + price;
    }
}

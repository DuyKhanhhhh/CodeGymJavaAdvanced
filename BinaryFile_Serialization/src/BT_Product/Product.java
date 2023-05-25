package BT_Product;

import java.io.Serializable;

public class Product implements Serializable {
    public int id;
    public String name;
    public int price;
    public String brand;
    public Product(){}
    public Product(int id, String name, int age, String classs){
        this.id = id;
        this.name = name;
        this.price = age;
        this.brand = classs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString(){
        return "Mã: " + getId() + "\n" +
                "Tên: " + getName() + "\n" +
                "Giá: " + getPrice() + "\n" +
                "Hãng: " + getBrand() + "\n";
    }
}

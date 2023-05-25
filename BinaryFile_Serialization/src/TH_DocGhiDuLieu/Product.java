package TH_DocGhiDuLieu;

import java.io.Serializable;

public class Product implements Serializable {
    public int proID;
    public String proName;
    public int price;
    public Product(){}
    public Product(int proID, String proName, int price){
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }
    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "ProId: " + getProID() + "\n" +
                "ProName: " + getProName() + "\n" +
                "Price: " + getPrice() + "\n";
    }

}

package TH_DocGhiDuLieu;

import java.io.*;

public class ProductApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product objProduct1 = new Product();
        objProduct1.setProID(1);
        objProduct1.setProName("Duy Khanh");
        objProduct1.setPrice(2000);
        Product objProduct2 = new Product(2, "DUyyy Khanhhhh", 1540);
        ProductProcess objProductProcess = new ProductProcess() ;
        Product [] listProduct = new Product[3]; //tạo ra một mảng rỗng có 3 phần tử
        listProduct[0] = objProduct1;//Chuyển vào mảng
        listProduct [1] = objProduct2;
        objProductProcess.writeObjectData(listProduct, "object.dat");
        objProductProcess.readObjectData("object.dat");
    }
}

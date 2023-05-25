package TH_DocGhiDuLieu;

import java.io.*;
import java.util.Arrays;

public class ProductProcess {
    public boolean writeObjectData(Product[] objProduct, String fileName) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOutputStream);
            objOut.writeObject(objProduct);//Ghi
            objOut.close();
            return true;
        }catch (IOException e){
            e.getMessage();
            return false;
        }
    }
    public void readObjectData(String filename) throws IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objInPut = new ObjectInputStream(fileInputStream);//Đọc
            //Tạo ra một mảng đối tượng mới
            Product [] products = (Product[]) objInPut.readObject();// Ép kiểu đối tượng
            System.out.print(Arrays.toString(products));//In ra đối tượng
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

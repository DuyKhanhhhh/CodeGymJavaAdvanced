package BT_Product;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductProcess {
    public boolean writeProduct(Product objProduct, String fileName)throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            return true;
        }catch (IOException e){
            e.getMessage();
            return false;
        }
    }

}

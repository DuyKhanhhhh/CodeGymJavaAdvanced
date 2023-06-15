package CaseStudy;

import java.io.*;

public class ProductManager {
    private Product [] arrayProduct;
    private String fileName;
    public ProductManager(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(this.fileName = fileName);
        if (file.exists()){
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(fileName));
            this.arrayProduct = (Product[]) objectInput.readObject();
            objectInput.close();
        }else {
            file.createNewFile();
        }
    }
    public boolean updateData()throws IOException{
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(this.fileName));
        objectOutput.writeObject(this.arrayProduct);
        objectOutput.close();
        return true;
    }
    public void getAll(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(fileName));
        Product [] products = (Product[]) objectInput.readObject();
        for (Product product: products) {
            System.out.println(product);
        }
    }
    public Product getById(String id){
        for (Product product: arrayProduct) {
            product.getId().equals(id);
            return product;
        }
        return null;
    }
    public boolean add(Product product) throws IOException {
        Product [] newProduct = new Product[arrayProduct.length + 1];
        for (int i = 0; i < arrayProduct.length; i++) {
            newProduct[i] = arrayProduct[i];
        }
        newProduct[arrayProduct.length] = product;
        return updateData();
    }
    public boolean delete(String id) throws IOException {
        Product [] newProduct = new Product[arrayProduct.length - 1];
        for (int i = 0, j = 0; i < newProduct.length; i++, j++) {
            if (this.arrayProduct[i].getId().equals(id)){
                i++;
            }else {
                newProduct[j] = arrayProduct[i];
            }
        }
        newProduct = this.arrayProduct;
        return updateData();
    }
    public boolean update(){
        for (Product product: arrayProduct) {
        }
        return true;
    }
}

package CaseStudy;

public class Product {
    private String id;
    private String product;
    private int price;
    private int quantity;
    private String unit;

    public Product() {
    }

    public Product(String id, String product, int price, int quantity, String unit) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public boolean setProduct(String product) {
        if (product.matches("^(CG)[a-zA-Z0-9]*\\s*")){
            this.product = product;
            return true;
        }else {
            System.out.println("Nhập saiii");
            return false;
        }
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        if (Integer.toString(price).matches("^1000$|^([1-9]\\d{3,})$")){
            this.price = price;
            return true;
        }else {
            System.out.println("Nhập saiii");
            return false;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public boolean setUnit(String unit) {
        if (unit.matches("(cái|chiếc|hộp)")){
            this.unit = unit;
            return true;
        }else {
            System.out.println("Nhập saiii");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Product: " +
                "id = '" + id + '\'' +
                ", product = '" + product + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                ", unit = '" + unit + '\'';
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setPrice(20);
        System.out.println(product1.getPrice());
    }
}

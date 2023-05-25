package BT_ToanTu3Ngoi;

public class TernaryOperator {
    public static void main(String[] args) {
        String str = null;
        String message = (str == null) ? "" : str.substring(0,5);
        // str == null thì sẽ in ra rỗng
        // substring cắt từ 0 đến 5
        System.out.println(message);

        str = "Geeksforgeeks";
        // str == có giá trị thì sẽ in ra và cắt từ 0 đến 5
        message = (str == null) ? "" :  str.substring(0,5);
        System.out.println(message);
    }
}

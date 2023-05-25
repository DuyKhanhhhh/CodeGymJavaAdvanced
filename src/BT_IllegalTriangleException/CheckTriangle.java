package BT_IllegalTriangleException;

public class CheckTriangle {
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 || b > 0 ||c > 0){
            if (a + b <= c || a + c <= b || b + c <= a){
                throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ");
            }else {
                System.out.println("Tam giác hợp lệ");
            }
        }
    }
}

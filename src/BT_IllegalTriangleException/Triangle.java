package BT_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckTriangle check = new CheckTriangle();
        try {
            System.out.println("Nhập vào cạnh thứ nhất: ");
            int a = scanner.nextInt();
            System.out.println("Nhập vào cạnh thứ hai: ");
            int b = scanner.nextInt();
            System.out.println("Nhập vào cạnh thứ 3: ");
            int c = scanner.nextInt();
            try {
                check.checkTriangle(a , b ,c );
            }catch (IllegalTriangleException ex){
                System.out.println(ex.getMessage());
            }
        }catch (Exception e){
            System.out.println("Lỗi: Không định dạng! ");
        }
        scanner.close();
    }
}

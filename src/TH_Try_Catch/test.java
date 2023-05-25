package TH_Try_Catch;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Hay nhập vao: ");
            //Phân tích chuỗi int thành interger
            int n = Integer.parseInt(scanner.nextLine());
            if (99 % n == 0){
                System.out.println(n + "Is a factor of 99");
            }
            // Bắt lỗi 1 số chia hết cho 0
        }catch (ArithmeticException a){
            System.out.println("Arithmetic " + a);
            //Bắt lỗi ép kiểu
        }catch (NumberFormatException a){
            System.out.println("Number Format " + a);
        }
    }
}

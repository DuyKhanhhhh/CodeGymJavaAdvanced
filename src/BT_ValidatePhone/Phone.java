package BT_ValidatePhone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String [] args) {
        String phoneNumber = "\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại: ");
        String  number = scanner.nextLine();
        Pattern pattern = Pattern.compile(phoneNumber);// biểu diễn biểu thức chính quy được biên dịch
        Matcher matcher = pattern.matcher(number); // So sánh biểu thức chính quy
        if (matcher.matches()){
            System.out.println("Số điện thoại hợp lệ");
        }else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}

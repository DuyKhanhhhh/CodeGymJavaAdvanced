package TH_validateEmail;

import java.util.Scanner;

public class EmailExampleTest {
    public static final String [] validEmail = new String[]{"a@gmail.com" , "ab@yahoo.com", "abc@hotmail.com"};//Tảo mảng có các chuỗi email hợp lệ
    public static final String [] invalidEmail = new String[] {"@gmail.com" , "ab@gmail.", "@!&abc@gmail.com"};//Tảo mảng có các chuỗi email không hợp lệ

    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String email: validEmail) { // duyệt mảng
            boolean isvalid = emailExample.validate(email);//validate dùng để kiểm tra tính hợp lệ của một đói tượng
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email: invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }


}

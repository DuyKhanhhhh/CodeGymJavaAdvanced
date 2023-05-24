package BT_ValidateClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class {
    public static void main(String[] args) {
        String nameClass = "^[APC]+\\d{4}+[GHIK]";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String clas = scanner.nextLine();
        Pattern pattern = Pattern.compile(nameClass);
        Matcher matcher = pattern.matcher(clas);
        if (matcher.matches()){
            System.out.println("Lớp có tồn tại");
        }else {
            System.out.println("Lớp không tồn tại");
        }
    }
}
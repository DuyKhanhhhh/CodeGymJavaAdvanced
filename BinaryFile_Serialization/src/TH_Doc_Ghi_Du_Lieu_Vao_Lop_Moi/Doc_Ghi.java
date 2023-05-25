package TH_Doc_Ghi_Du_Lieu_Vao_Lop_Moi;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Doc_Ghi {
    public boolean writeData(String data, String fileName) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            fileOut.write(data.getBytes());
            System.out.println("Dữ liệu ghi vào thành công!");
            fileOut.close();
            return true;
        }catch (IOException e) {
            e.getMessage();
            return false;
        }
        //4 Yếu tố tạo nên là
        //Tên Phương thức là witeData
        //Tham số đầu vào là String data, String fileName
        //Kiểu trả về boolean
    }
    public void readData(String fileName)throws IOException{
        try {
            FileInputStream fileInput = new FileInputStream(fileName);
            int i = 0;
            while ((i = fileInput.read())!= -1){
                System.out.print((char) i);
            }
            fileInput.close();
        }catch (IOException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) throws IOException {
        Doc_Ghi docGhi = new Doc_Ghi();
        System.out.print("Nhập dữ liệu vào file: ");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        docGhi.writeData(i, "data.dat");
        docGhi.readData("data.dat");
    }
}

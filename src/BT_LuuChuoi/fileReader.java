package BT_LuuChuoi;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) throws Exception {
        //Đọc fileReader
        FileReader fileReader = new FileReader("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\BT_LuuChuoi\\test.txt");
        int i;
        // In ra chuỗi
        while ((i = fileReader.read()) != -1){
            //Ép kiểu sang dạng số
            System.out.print((char) i);
        }
        fileReader.close();
    }
}

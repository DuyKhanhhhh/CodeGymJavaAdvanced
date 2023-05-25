package BT_LopFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BT_LopFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\BT_LopFile\\Test.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Nguyên nguu");
        if (file.createNewFile()){
            System.out.println("Phai đã được tạo thành công");
        }
        if (file.isDirectory()){
            System.out.println("File này là thư mục");
        }else {
            System.out.println("File này không phải là thư mục");
        }
    }
}

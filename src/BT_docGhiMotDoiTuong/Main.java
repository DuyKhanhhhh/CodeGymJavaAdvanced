package BT_docGhiMotDoiTuong;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student = new Student(01, "Khanh", 6 , 7, 8);
        File file = new File("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\BT_docGhiMotDoiTuong\\Student.txt");
        file.createNewFile();
        
    }
}

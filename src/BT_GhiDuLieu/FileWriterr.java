package BT_GhiDuLieu;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\BT_GhiDuLieu\\text.txt");
        fileWriter.write("Helloo World1111");
        fileWriter.close();
    }
}

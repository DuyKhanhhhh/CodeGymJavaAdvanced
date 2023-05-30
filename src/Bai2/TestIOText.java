package Bai2;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class TestIOText {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\TítDzvl\\IdeaProjects\\KiemTraDocGhiFile\\src\\Bai1\\list_song.txt");
        file. createNewFile();
        String [] arraySong ={"Hello califonia", "We don’t talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình."};
        writeDataToFileWithFileWriter(arraySong , file);
        readDataToFileWithFileReader(file);
        writeDataToFileWithBufferWriter(arraySong, file);
        readDataToFileWithBufferReader(file);
    }



    private static void writeDataToFileWithFileWriter(String[] arraySong, File file) throws IOException{
        FileWriter fileWriter = new FileWriter(file);
        for (String song: arraySong) {
            fileWriter.write(song + "\n");
        }
        System.out.println("Đã ghi vào file");
        fileWriter.close();
    }
    private static void readDataToFileWithFileReader(File file)throws IOException {
        FileReader fileReader = new FileReader(file);
        int line;
        while ((line = fileReader.read()) != -1){
            System.out.print((char) line);
        }
        System.out.println("Đã in ra");
    }
    public static void writeDataToFileWithBufferWriter(String [] arraySong, File file) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        for (String song: arraySong) {
            bufferedWriter.write(song + "\n");
        }
        bufferedWriter.close();
        System.out.println("Đã ghi vào file Buffer");
    }
    private static void readDataToFileWithBufferReader(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
        System.out.println("Đã in ra Buffer");
    }
}

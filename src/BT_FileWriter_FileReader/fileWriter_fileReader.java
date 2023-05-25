package BT_FileWriter_FileReader;

import java.io.*;

public class fileWriter_fileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\BT_FileWriter_FileReader\\Text.txt");
        file.createNewFile();
        //Ghi dữ liệu vào file có sẵn
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Vu Duy Khanh");
            fileWriter.close();
        }catch (Exception e){
            e.getMessage();
        }

        try {
            FileReader fileReader = new FileReader(file);
            //Đọc dữ liệu trong file
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            // In ra dữ liệu trong file
              while ((line = bufferedReader.readLine()) != null){//String để null Int để -1
                  System.out.println(line);
              }
        } catch (IOException e){
            e.getMessage();
        }
    }
}

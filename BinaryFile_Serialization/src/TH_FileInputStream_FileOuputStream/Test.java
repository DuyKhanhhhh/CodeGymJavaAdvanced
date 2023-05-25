package TH_FileInputStream_FileOuputStream;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        String data = "Vu Duy Khanh";
        FileOutputStream output = null;
        FileInputStream input = null;

        try {
            output = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\BinaryFile_Serialization\\src\\FileInputStream_FileOuputStream\\person.dat");
            input = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\BinaryFile_Serialization\\src\\FileInputStream_FileOuputStream\\person.dat");
            byte[] bytes = data.getBytes();
            output.write(bytes);
            int i = 0;
            while ((i = input.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.getMessage();
        }finally {
            output.close();
            input.close();
        }
    }
}

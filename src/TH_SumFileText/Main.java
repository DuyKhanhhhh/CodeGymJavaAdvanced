package TH_SumFileText;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Tạo file
        File file = new File("C:\\Users\\TítDzvl\\IdeaProjects\\I-O_textFile\\src\\TH_SumFileText\\text.txt");
        file.createNewFile();
        System.out.print("Nhập Đường Dẫn Vào File: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.redFileText(path);
    }
}

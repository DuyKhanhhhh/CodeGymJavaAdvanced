package TH_SumFileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void redFileText(String fileFath){
        try {
            // Đọc file theo đường dẫn
            File file = new File(fileFath);
            // Kiểm tra xem file không tồn tại thì nén ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                //Ép kiểu từ String sang integer
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng: " + sum) ;
        }catch (Exception e){
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}

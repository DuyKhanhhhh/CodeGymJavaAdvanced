package BT_CrawTinTuc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawTinTuc {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            //dùng để đọc nội dung URL
            scanner.useDelimiter("\\Z");
            //Dùng để thiết lập phân cách scammmer thành kết thức chuỗi ký tự đầu vào cuối cùng là z
            String content = scanner.next();
            scanner.close();
            // đóng sacmmer
            content = content.replaceAll("\\n+", "");
            // xóa tắt cả các dòng mới
            Pattern pattern = Pattern.compile("<h3 class=\"article-title\"(.*?).htm..(.*?)><(.*?)");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(2));
            }
        }catch (MalformedURLException e){
            e.getMessage();
        }catch (UnsupportedEncodingException e){
            e.getMessage();
        }catch (IOException e){
            e.getMessage();
        }

    }
}

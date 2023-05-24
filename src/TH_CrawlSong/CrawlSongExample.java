package TH_CrawlSong;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            //dùng để đọc nội dung URL
            scanner.useDelimiter("\\Z");
            //Dùng để thiết lập phân cách scammmer thành kết thức chuỗi ký tự đầu vào cuối cùng là z
            String content = scanner.next();
            scanner.close();
            // đóng sacmmer
            content = content.replaceAll("\\n+", "");
            // xóa tắt cả các dòng mới
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
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

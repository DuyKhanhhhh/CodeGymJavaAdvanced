package TH_validateEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static Pattern pattern;//Cung cấp các phương thức tạo biểu  thức chính quy
    public Matcher matcher; //Dùng để tìm kiếm và khớp với các chuỗi ký tự
    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    //^: bắt đầu ròng bằng String
    //*@: kết thức bằng ý hiệu @
    //\\.: cuối .com, .net .org...
    //$: kết thưc
    public EmailExample(){
        pattern = Pattern.compile(EMAIL_REGEX); //biên dịch một biểu thức chính quy thành đối tượng Pattern
    }
    public boolean validate(String regex){// kiểm tra xem email có hợp lệ với EMAIL_REGEX kh
        matcher = pattern.matcher(regex);// kiểm tra xem chuỗi đầu vaào có khớp với biểu thức trính quy hay kh //tạo ta chuỗi đầu vào
        return matcher.matches();// in ra true hoặc false
    }
}

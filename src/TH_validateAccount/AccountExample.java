package TH_validateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static final String ACCOUTREGEX = "^[_a-z0-9]{6,}$";
    public AccountExample(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ACCOUTREGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

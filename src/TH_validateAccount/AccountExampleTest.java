package TH_validateAccount;

import java.util.Arrays;

public class AccountExampleTest {
    public static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123acv", "b231dc", "kha_sq"};
    public static final String[] invalidAccount = new String[]{".@", "12345", " 1234_"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        System.out.println(Arrays.toString(invalidAccount));
        for (String account: validAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
        for (String account: invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isValid);
        }
    }

}

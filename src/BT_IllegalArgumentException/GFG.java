package BT_IllegalArgumentException;

public class GFG {
    public static void main(String[] args) {
        String s = "";
        // IllegalArgumentException lỗi xảy ra khi truyền đối số không phù hợp cho phương thức.
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
        s = "GeeksforGeeks";

        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
    }
    //ham getLenght để ktra nếu s có giá trị nul thì sẽ in ra lỗi
    public static int getLength(String s){
        if (s == null){
            throw new IllegalArgumentException("The argument cannot be null");
            // ném ra ngoại lệ cụ thể là The argument cannot be null
        }
        return s.length();
        //in ra chuỗi s
    }
}

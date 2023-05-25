package BT_NullPoiterException;

public class GFG {
    public static void main(String[] args) {
        // ptr có giá trị null
        String ptr = null;
        // so sánh ptr mà là gfg thì in ra same còn khong sẽ in ra Not Same
//        if (ptr.equals("gfg")){
//            System.out.println("Same");
//        }else {
//            System.out.println("Not Same");
//        }

//        try {
//            if (ptr.equals("gfg")){
//                System.out.println("Same");
//            }else {
//                System.out.println("Not Same");
//            }
//            // bắt lỗi thao tắc với chuỗi rỗng
//        }catch (NullPointerException e ){
//            System.out.println("NullPointerException Caught");
//        }
        //bị bắt lỗi chuỗi rỗng

        try {
            if ("gfg".equals(ptr)){
                System.out.println("Same");
            }else {
                System.out.println("Not Same");
            }
            // bắt lỗi thao tắc với chuỗi rỗng
        }catch (NullPointerException e ){
            System.out.println("NullPointerException Caught");
        }
        // kh bị bắt lỗi chuỗi rỗng
    }
}

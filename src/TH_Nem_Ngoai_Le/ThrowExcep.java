package TH_Nem_Ngoai_Le;

public class ThrowExcep {
    static void fun(){
        try {
            //tạo ra một ngoại lệ NullPointe. Ngoại lệ này được nén ra khi có trương trình cố găng sử dụng một đối tượng null
            throw new NullPointerException("Demo");
        }catch (NullPointerException e){
            System.out.println("Caught inside fun().");
            throw e; // ném ra ngoại lệ
        }
    }

    public static void main(String[] args) {
        try {
            fun();
        }catch (NullPointerException e){
            System.out.println("Caught in main.");
        }
    }
}

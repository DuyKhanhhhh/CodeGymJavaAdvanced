package TaoClassNgoaiLe;

public class Main {
    public static void main(String[] args) {
        try {
            //ném một đối tượng cho người dùng sacs định
            throw new MyException("GeeksGeeks");
        }catch (MyException ex){
            System.out.println("Caught");

            //getMessage in ra thông báo từ đối tượng MyException
            System.out.println(ex.getMessage());
        }
    }
}
//đoan mã trên có 2 lớp
// lớp 1 : khơi tạo lớp ngoại lệ
// lớp 2 :thực thi trương trình
// Đoạn mã trên in ra kq

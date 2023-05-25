package TaoClassNgoaiLe;

public class MyException extends Exception{
    //Khởi tạo class ngoại lệ
    public MyException (String s){
        //  gọi constructor của lớp cha Exception
        super(s);
    }
}

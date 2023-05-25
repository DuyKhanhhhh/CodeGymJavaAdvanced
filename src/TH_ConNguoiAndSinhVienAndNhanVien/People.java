package TH_ConNguoiAndSinhVienAndNhanVien;

public abstract class People {
    //Khai báo biến
    public String name;
    public int age;
    public boolean gender;
    //Khởi tạo có tham số
    public People(String name, int age, boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //Khởi tạo trừu tượng
    public abstract void eat();
    public abstract void sleep();
    public abstract void study();
    
}

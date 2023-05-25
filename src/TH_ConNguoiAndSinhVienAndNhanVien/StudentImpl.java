package TH_ConNguoiAndSinhVienAndNhanVien;
//Student kế thừa People và kế thừa trừu tượng interface Student
public class StudentImpl extends People implements Student{
    //Khời tạo có tham số
    public StudentImpl (String name, int age, boolean gender){
        super(name, age ,gender);
        //Kế thừa
    }
    //Kế thừa trừu tương
    @Override
    public void eat(){
        System.out.println("Ăn C");
    }
    @Override
    public void sleep(){
        System.out.println("Ngủ");
    }
    @Override
    public void study(){
        System.out.println("Học");
    }
    @Override
    public void registerCourse(String course){
        System.out.println(course);
    }
    @Override
    public void attendClass(){
        System.out.println("ISBK1D2");
    }
    //ghi đè
    @Override
    public String toString(){
        return  super.toString();
    }
}

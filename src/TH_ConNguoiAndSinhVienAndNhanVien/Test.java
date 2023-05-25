package TH_ConNguoiAndSinhVienAndNhanVien;

public class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Khánh", 19, true);
        student.eat();
        student.sleep();
        student.study();
        student.registerCourse("CodeGym");
        student.attendClass();
    }
}

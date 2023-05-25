package BT_Student;

import java.io.IOException;

public class StudentApp {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student(1, "Khanh", 2,"IBSK1D2");
        Student student2 = new Student(2, "Khanh", 3,"IBSK1D2");
        Student student3 = new Student(3, "Khanh", 5,"IBSK1D2");
        Student student4 = new Student(4, "Khanh", 7,"IBSK1D2");
        Student student5 = new Student(5, "Khanh", 8,"IBSK1D2");
        StudentProcess studentProcess = new StudentProcess();
        Student [] students = new Student [5];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        studentProcess.writeStudent(students, "student.dat");
        studentProcess.readStudent("student.dat");
    }
}

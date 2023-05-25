package BT_Student;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentProcess {
    public boolean writeStudent(Student[] objStudent, String fileName) throws IOException {
        try {
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            ObjectOutputStream objOutPut = new ObjectOutputStream(fileOutput);
            objOutPut.writeObject(objStudent);
            objOutPut.close();
            System.out.println("Ghi thành  công");
            return true;
        }catch (IOException e){
            e.getMessage();
            return false;
        }
    }
    public void readStudent(String fileName)throws IOException{
        try {
            FileInputStream objInPut = new FileInputStream(fileName);
            ObjectInputStream objectInput = new ObjectInputStream(objInPut);
            Student [] students = (Student[]) objectInput.readObject();
            for (Student st:
                 students) {
                System.out.println(st);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

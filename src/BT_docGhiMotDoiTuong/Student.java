package BT_docGhiMotDoiTuong;

public class Student {
    public int id;
    public String name;
    public int mathScore;
    public int physicsScore;
    public int chemicalsScore;
    public Student (){}
    public Student(int id, String name, int mathScore, int physicsScore, int chemicalsScore){
        this.id = id;
        this.name = name;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemicalsScore = chemicalsScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public int getChemicalsScore() {
        return chemicalsScore;
    }

    public void setChemicalsScore(int chemicalsScore) {
        this.chemicalsScore = chemicalsScore;
    }
    public String toString(){
        return "Mã Sinh Viên: " + getId() + "\n"
                + "Tên Sinh Viên: " + getName() + "\n"
                + "Điểm Toán: " + getMathScore() + "\n"
                + "Điểm Lý: " + getPhysicsScore() + "\n"
                + "Điểm Hóa: " + getChemicalsScore();
    }
}

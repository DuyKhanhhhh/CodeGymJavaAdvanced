package Bai1;

public class Teacher extends People{
    public Boolean lever;
    public String experience;
    public String subject;

    public Boolean isLever() {
        return lever;
    }

    public void setLever(Boolean lever) {
        this.lever = lever;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher (){
        super();
    }

    public Teacher(String name, int age, boolean sex, int height, int weight, Boolean lever, String experience, String subject) {
        super(name, age, sex, height, weight);
        this.lever = lever;
        this.experience = experience;
        this.subject = subject;
    }
    @Override
    public String toString(){
        return  super.toString() +
                "Lever: " + (isLever() ? "ThS" : "TS") + "\n"
                + "Experience: " + getExperience() + "\n"
                + "Subject: " + getSubject() ;
    }
}

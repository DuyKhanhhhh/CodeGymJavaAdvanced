package Bai1;

public class People {
    public String name;
    public int age;
    public boolean sex;
    public int height;
    public int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public People() {
    }

    public People(String name, int age, boolean sex, int height, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return "Name: " + getName() + "\n"
                + "Age: " + getAge() + "\n"
                + "Sex: " + (isSex() ? "Nam" : "Nữ") + "\n"
                + "Height: " + getHeight() + "\n"
                + "Weight: " + getWeight() + "\n";
    }
}

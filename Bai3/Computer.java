package Bai3;

import java.io.*;
import java.util.Arrays;

public class Computer implements Serializable{
    private String id;
    private String name;
    private String brand;
    private String config;
    private int price;
    private boolean status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", config='" + config + '\'' +
                ", price=" + price +
                ", status=" + status ;
    }

    public Computer(String id, String name, String brand, String config, int price, boolean status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.config = config;
        this.price = price;
        this.status = status;
    }
    public Computer() {
        Computer computerList [] = new Computer[0];
    }
    //Thêm một máy tính vào mảng
    public Computer[] addComputerToArray(Computer[] addComputer){
        Computer [] newListComputer = new Computer[addComputer.length + 1];
        for (int i = 0; i < addComputer.length; i ++){
            newListComputer[i] = addComputer[i];
        }
        newListComputer[addComputer.length] = this;
        return newListComputer;
    }
    //Add mội máy tính vào file
    public void addComputerToFile(Computer computer)throws IOException{
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("database.txt"));
        objectOutput.writeObject(computer);
        objectOutput.close();
    }
    //Đọc và ghi máy tính
    public void getDataFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(fileName);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        Computer computer = (Computer) objectInput.readObject();
        System.out.println(computer.toString());
        objectInput.close();

    }
    //Lưu danh sách máy tính vào mảng
    public void addComputersToFile(Computer [] addComputerFile) throws IOException {
        FileOutputStream fileOutput = new FileOutputStream("database.txt");
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
        objectOutput.writeObject(addComputerFile);
        objectOutput.close();
    }

    //Đọc và ghi máy tính vào mảng
    public void getAllComputerFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream(fileName);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);
        Computer [] computers = (Computer[]) objectInput.readObject();
        for (Computer computer: computers) {
            System.out.println(computer);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Computer computer = new Computer("ID0", "Khanh", "5OO33O", "I7", 4421, true);
        Computer computer1 = new Computer("ID01", "Khanh", "2O12OO", "I3", 1120, true);
        Computer computer2 = new Computer("ID02", "Khanh", "1OO1O", "I6", 5240, true);
        Computer computer3 = new Computer("ID03", "Khanh", "5OOO4", "I7", 22220, true);
        Computer computer4 = new Computer("ID04", "Khanh", "2OO2O", "I10", 20000, true);
        Computer [] arrayComputer = new Computer[0];
        arrayComputer = computer.addComputerToArray(arrayComputer);
        arrayComputer = computer1.addComputerToArray(arrayComputer);
        arrayComputer = computer2.addComputerToArray(arrayComputer);
        arrayComputer = computer3.addComputerToArray(arrayComputer);
        arrayComputer = computer4.addComputerToArray(arrayComputer);
        computer.addComputerToFile(computer1);
        computer.getDataFromFile("database.txt");
//        computer.addComputersToFile(arrayComputer);
//        computer.getAllComputerFromFile("database.txt");
    }
}

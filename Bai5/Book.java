package Bai5;

import Bai3.Computer;

import java.io.*;

public class Book implements Serializable {
    private String id;
    private String name;
    private String brand;
    private String author;
    private double price;
    private boolean status;



    public Book(String id, String name, String brand, String author, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.author = author;
        this.price = price;
        this.status = status;
    }
    public Book() {
        Book [] listBook = new Book[0];
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", status=" + ((status) ? "Còn Hàng" : "Hết Hàng") +
                '}';
    }

    public Book [] addBookToArray(Book [] listBook){
        Book [] newArrayBook = new Book[listBook.length +1];
        for (int i = 0; i < listBook.length; i++) {
            newArrayBook[i] = listBook[i];
        }
        newArrayBook[listBook.length] = this;
        return newArrayBook;
    }
    public void addBookToFile(Book book) throws IOException {
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("data.txt"));
        objectOutput.writeObject(book);
        objectOutput.close();
    }
    public void getDataFromFile(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file));
        Book book = (Book) objectInput.readObject();
        System.out.println(book.toString());
        objectInput.close();
    }
    public void addBooksToFile(Book [] books)throws IOException{
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("data.txt"));
        objectOutput.writeObject(books);
        objectOutput.close();
    }
    public void getAllBookFromFile(String file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file));
        Book [] books = (Book[]) objectInput.readObject();
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book = new Book("IBS", "Duy Khanh", "LO", "Hell", 2,true);
        Book book1 = new Book("IBS1", "Duy Khanh", "LO2", "Hell", 2,true);
        Book book2= new Book("IB2S", "Duy Khanh", "LO", "Hell", 2,true);
        Book book3= new Book("IBS24", "Duy Kh4213anh", "LO123", "Hell", 2,true);
        Book [] arrayBook = new Book[0];
        arrayBook = book.addBookToArray(arrayBook);
        arrayBook = book1.addBookToArray(arrayBook);
        arrayBook = book2.addBookToArray(arrayBook);
        arrayBook = book3.addBookToArray(arrayBook);
       book.addBookToFile(book1);
       book.getDataFromFile("data.txt");
//       book.addBooksToFile(arrayBook);
//       book.getAllBookFromFile("data.txt");
    }
}

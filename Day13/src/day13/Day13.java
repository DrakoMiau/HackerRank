
package day13;

import java.util.Scanner;

abstract class Book{
    String title;
    String author;
    abstract void display();
}

class MyBook extends Book{
    private int price;
    public MyBook(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title + "\n"+ "Author: " + this.author + "\n" + "Price: " + this.price);
    }
    
}
public class Day13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();
        String authorName = scan.nextLine();
        int bookPrice = scan.nextInt();
        
        Book book = new MyBook(bookName, authorName, bookPrice);
        book.display();
    }
}

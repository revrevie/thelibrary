package librarysystem;

import java.util.ArrayList;

public class Book {
    //comment time
    /////Attributes


    private String bookTitle;
    private String author;
    private Long refNumber;


    /////Constructors
    public Book(String bookTitle, String author, Long refNumber){
        this.bookTitle = bookTitle;
        this.author = author;
        this.refNumber = refNumber;
    }

    public Book() {

    }
/*
    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public Book() {

    }
*/



    /////Methods

    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setRefNumber(Long refNumber) {
        this.refNumber = refNumber;
    }

    public Long getRefNumber() {
        return refNumber;
    }


    public void getBookTitle(String nextLine) {
    }

}

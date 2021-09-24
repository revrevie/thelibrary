package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> listOfBooks;


    public static void main(String[] args) {
        listOfBooks = new ArrayList<>();
        Scanner key = new Scanner(System.in);
        for (; true; ) {
            System.out.println("To add a new book to the system press 1. To remove a book from the system press 2. To view information on a book, select 3.");
            int decide = key.nextInt();
            switch (decide) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 ->   getBookInfo();
                default -> System.out.println("Come on man, there were only 2 choices.");
            }
            System.out.println("The current list of books is: " + listOfBooks);

        }
    }


    public static void removeBook() {
        Scanner remove = new Scanner(System.in);
        Book book = new Book();
        System.out.println("The current available books are: " + listOfBooks);
        System.out.println("What book would you like to remove?");
        listOfBooks.remove(remove.nextLine());


    }

    public static void addBook() {
        Scanner names = new Scanner(System.in);
        Book book = new Book();
        System.out.println("How many books?");
        int bookNumber = names.nextInt();
        while (bookNumber > 0) {
            System.out.println("What is the title of the book? No spaces");
            book.setBookTitle(names.next());
            System.out.println("Who is the Author?");
            book.setAuthor(names.next());
            System.out.println("What is the reference number?");
            book.setRefNumber(names.nextLong());
            listOfBooks.add(book.getBookTitle());
            bookNumber--;
        }
        //System.out.println("The current list of books is:" + listOfBooks);
    }

    public static void getBookInfo(){
        Scanner author = new Scanner(System.in);
        Book book = new Book();
        System.out.println("The available list of books are: " + listOfBooks);
        System.out.println("What book are you wanting information on?");
        listOfBooks.get(Integer.parseInt(author.nextLine()));
    }

}






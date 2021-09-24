package librarysystem;

//import static org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    @DisplayName("Test to retrieve book")
    public void testGetBook(){
        Book testBook = new Book();
        testBook.setBookTitle("Harry Potter");
        assertEquals("Harry Potter",testBook.getBookTitle(),"Did this work?");
    }

    @Test
    @DisplayName("Test to retrieve author")
    public void testGetAuthor(){
        Book testBook = new Book();
        testBook.setAuthor("J.K. Rowling");
        assertEquals("J.K. Rowling",testBook.getAuthor(),"this test doesn't show much");
    }

    @Test
    @DisplayName("Test to retrieve reference number")
    public void testGetRefNumber(){
        Book testBook = new Book();
        testBook.setRefNumber(654564654564L);
        assertEquals(654564654564L,testBook.getRefNumber(),"another bad one");
    }

    @Test
    @DisplayName("Testing adding a book with info")
    public void testGetAndSet(){
        Book testBook = new Book("10000 Leagues under the sea","H G Wells",543125646L);
        assertEquals("10000 Leagues under the sea",testBook.getBookTitle(),"This is not the right name");
        assertEquals("H G Wells",testBook.getAuthor(),"this is not the author");
        assertEquals(543125646L,testBook.getRefNumber(),"This is not the reference number");

    }


}

package librarysystem;

//import static org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @Test
    @DisplayName("Test to retrieve book")
    public void testGetBook(){
        Book testBook = new Book();
        testBook.setBookTitle("Harry Potter");
        assertEquals(testBook.getBookTitle(),"Harry Potter","Did this work?");
    }

    @Test
    @DisplayName("Test to retrieve author")
    public void testGetAuthor(){
        Book testBook = new Book();
        testBook.setAuthor("J.K. Rowling");
        assertEquals(testBook.getAuthor(),"J.K. Rowling","this test doesn't show much");
    }

    @Test
    @DisplayName("Test to retrieve reference number")
    public void testGetRefNumber(){
        Book testBook = new Book();
        testBook.setRefNumber(654564654564L);
        assertEquals(testBook.getRefNumber(),654564654564L,"another bad one");
    }

    @Test
    @DisplayName("Test to retrieve wrong book name")
    public void testGetWrongBook(){
        Book testBook = new Book();
        testBook.setBookTitle("The Expanse");
        assertEquals(testBook.getBookTitle(),"Leviathan Wakes","This is the wrong name");
    }
}

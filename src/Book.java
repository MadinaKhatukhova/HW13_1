import java.io.OptionalDataException;
import java.sql.SQLOutput;

public class Book {
    private int Year;
    private String Book;
    private int year;

    public void main(String[] args) {
        String nameBook = "Book ";
        String nameAuthor = "Author ";
        int Year = 2022;

        String year = null;
        System.out.println("Имя - " + nameBook + "Автор - " + nameAuthor + "Год публикации " + year);
        }
    public void setYear(int Year) {
        this.Year = Year;
        }
    public String getNameBook() {
        return this.Book;
    }
    public String getNameAuthor() {
        return (String) this.Author();
    }

    private Object Author() {


        return null;
    }

    private Object nameAuthor() {
        return null;
    }

    public int getYear() {
        return this.year;
    }
}





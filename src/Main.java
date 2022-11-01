import java.io.UnsupportedEncodingException;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Author sierra = new Author("Kathy","Sierra");
        Book headFirstJava = new Book("Head First Java", sierra, 2010);
        System.out.println("Название: " + headFirstJava.getName());
        System.out.println("Автор: " + headFirstJava.getAuthorName());
        headFirstJava.setYearPublishing(2012);
        System.out.println("Год: " + headFirstJava.getYearPublishing());

        System.out.println();

        Author schildt = new Author("Herbert", "Schildt");
        Book javaBeginnerGuide = new Book("java. Beginner Guide", schildt, 2020);
        System.out.println("Название: " + javaBeginnerGuide.getName());
        System.out.println("Автор: " + javaBeginnerGuide.getAuthorName());
        System.out.println("Год: " + javaBeginnerGuide.getYearPublishing());

        System.out.println(sierra);

        Author sierra2 = sierra;
        System.out.println(sierra.equals(sierra2));
        Author schildt2 = schildt;
        System.out.println(schildt.equals(schildt2));


       } }



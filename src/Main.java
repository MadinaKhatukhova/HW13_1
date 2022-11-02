import java.io.UnsupportedEncodingException;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        boolean hashCode = false;
        Author sierra = new Author(hashCode,"Kathy","Sierra");
        Book headFirstJava = new Book("Head First Java", sierra, hashCode, 2010);
        System.out.println("Название: " + headFirstJava.getName());
        System.out.println("Автор: " + headFirstJava.getFullName());
        headFirstJava.setYearPublishing(2012);
        System.out.println("Год: " + headFirstJava.getYearPublishing());

        System.out.println();

        Author schildt = new Author(hashCode, "Herbert", "Schildt");
        Book javaBeginnerGuide = new Book("java. Beginner Guide", schildt, hashCode, 2020);
        System.out.println("Название: " + javaBeginnerGuide.getName());
        System.out.println("Автор: " + javaBeginnerGuide.getFullName());
        System.out.println("Год: " + javaBeginnerGuide.getYearPublishing());

        System.out.println(sierra);

        Author sierra2 = sierra;
        System.out.println(sierra.equals(sierra2));
        Author schildt2 = schildt;
        System.out.println(schildt.equals(schildt2));


       } }



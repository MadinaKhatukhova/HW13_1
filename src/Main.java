public class Main {
    public static void main(String[] args) {

    }

    {
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

    }
    }



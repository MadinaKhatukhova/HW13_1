import Author.Author;

import java.awt.print.Book;


public class Main {

    public static void main(String[] args) {

        class Book {
            private int Year;
            private String Book;
            private int year;

            public Book(String s, Book schildt, int i) {

            }

            public Book(String kathy, String sierra) {

            }

            public void main(String[] args) {
                String nameBook = "Book ";

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
        Book sierra = new Book("Kathy", "Sierra");
        Book headFirstJava = new Book("Head First Java", sierra, 2010);
        System.out.println("Название: " + headFirstJava.getName());
        System.out.println("Автор: " + headFirstJava.getNameAuthor());
        headFirstJava.setYear(2012);
        System.out.println("Год: " + headFirstJava.getYear());

        System.out.println();
        Book schildt = new Book("Herbert", "Schildt");
        Book javaBeginnerGuide = new Book("java. Beginner Guide", schildt, 2020);
        System.out.println("Название: " + javaBeginnerGuide.getName());
        System.out.println("Автор: " + javaBeginnerGuide.getNameAuthor());
        System.out.println("Год: " + javaBeginnerGuide.getYear());



}

            private String getName() {
                return null;
            }
        }}}
import java.util.Objects;

public class Book {

    private String name;
    private String authorName;
    private int yearPublishing;
    public Book(String name, Author authorName, int yearPublishing) {
        this.name = name;
        this.yearPublishing = yearPublishing;
        this.authorName = String.valueOf((authorName));
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAuthorName() {return authorName;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}
    public int getYearPublishing() {return yearPublishing;}
    public void setYearPublishing(int yearPublishing) {this.yearPublishing = yearPublishing;}

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Book guest = (Book) obj;
        return yearPublishing == guest.yearPublishing
                && (authorName == guest.authorName
                || (authorName != null &&authorName.equals(guest.getAuthorName())))
                && (Objects.equals(name, guest.name)
                || (name != null && name .equals(guest.name())
        ));


    }


    private String name() {


        return null;
    }}






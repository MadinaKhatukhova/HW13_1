import java.util.Objects;

public class Book {

    private final boolean hashCode;
    private String name;
    private Author fullName;
    private int yearPublishing;
    public Book(String name, Author fullNameName, boolean hashCode, int yearPublishing) {
        this.name = name;
        this.hashCode = hashCode;
        this.yearPublishing = yearPublishing;
        this.fullName = fullName;
    }
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public Author getFullName() {return fullName;}
    public void setFullName(Author fullName) {this.fullName = fullName;}
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
                && (fullName == guest.fullName
                || (fullName != null &&fullName.equals(guest.getFullName())))
                && (Objects.equals(name, guest.name)
                || (name != null && name .equals(guest.name())
        ));
    }

    private String name() {
        return null;
    }


    @Override
    public int hashCode() {
        return Objects.hash(hashCode, name, fullName, yearPublishing);
    }
}



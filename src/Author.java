public class Author {

    private String firstName;
    private String lastName;
    private String fullName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.fullName = firstName + " " + secondName;
    }

    public String getFullName() {
        return this.fullName;
    }
    public String toString() {
        return firstName + ": " + fullName;


    }}
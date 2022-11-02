import java.util.Objects;

public class Author {

    private final boolean hashCode;
    private String firstName;
    private String lastName;
    private String fullName;
    public Author(boolean hashCode, String firstName, String lastName) {
        this.hashCode = hashCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getFullName() {return fullName;
    }
    public void seFullName(String fullName) {this.fullName = fullName;}
    public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
        Author guest = (Author) obj;
        return fullName == guest.fullName
                && (firstName == guest.firstName
                || (firstName != null &&firstName.equals(guest.getFirstName())))        && (lastName == guest.lastName
                || (lastName != null && lastName .equals(guest.getLastName())
        ));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCode, firstName, lastName, fullName);
    }

}
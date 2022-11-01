import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private String fullName;
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public String getFirstName() {return this.firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
    Author guest = (Author) obj;
            return firstName == guest.firstName
                    && (fullName == guest.fullName
                    || (fullName != null &&fullName.equals(guest.getFullName())))
                    && (Objects.equals(lastName, guest.lastName)
                    || (lastName != null && lastName .equals(guest.lastName())));

    }

    private void lastName() {
    }
    public String getFullName() {
        return this.fullName;
    public String toString() {
        return firstName + ": " + fullName;
    }}}
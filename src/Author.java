public class Author {
    private String fistName;
    private String lastName;

    public Author(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getFistName() + " " + getLastName();
    }
}

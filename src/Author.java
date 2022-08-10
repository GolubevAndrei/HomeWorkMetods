import java.util.Objects;

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

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author aNew = (Author) other;
        boolean Eq = fistName.equals(aNew.fistName) && lastName.equals(aNew.lastName);
        return Eq;
    }
}

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }


    public String toString() {
        return this.surname + " " + this.name;
    }

    public boolean equals(Author author) {
        if (this.getClass() != author.getClass()) {
            return false;
        }
        return (this.name.equals(author.name) && this.surname.equals(author.surname));
    }

    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }
}

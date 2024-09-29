import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.yearPublication = yearPublication;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }


    public String toString(){
        return "Название книги - " + this.name + "\nАвтор книги - " + this.author.toString() + "\nГод выпуска - " + this.yearPublication;
    }

    public boolean equals(Book book) {
        if (this.getClass() != book.getClass()) {
            return false;
        }
        return  (name.equals(book.name) && author.equals(book.author));
    }

    public int hashCode() {
        return java.util.Objects.hash(name, author);
    }
}


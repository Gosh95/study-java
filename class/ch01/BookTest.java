package ch01;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + "]";
    }


}

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("book", "author");

        System.out.println(book.toString());
    }

}

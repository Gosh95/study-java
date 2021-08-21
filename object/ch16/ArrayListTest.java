package ch16;

import java.util.ArrayList;

import ch14.Book;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new Book("book1", "author1"));
        library.add(new Book("book2", "author2"));
        library.add(new Book("book3", "author3"));
        library.add(new Book("book4", "author4"));
        library.add(new Book("book5", "author5"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
//			book1, author1
//			book2, author2
//			book3, author3
//			book4, author4
//			book5, author5

        }
    }

}

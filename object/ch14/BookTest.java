package ch14;

public class BookTest {

    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            //null .....
        }

        library[0] = new Book("title0", "author0");
        library[1] = new Book("title1", "author1");
        library[2] = new Book("title2", "author2");
        library[3] = new Book("title3", "author3");
        library[4] = new Book("title4", "author4");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < copyLibrary.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        } // 인스턴스를 따로 만들었기 때문에 독립적이다

//		System.arraycopy(library, 0, copyLibrary, 0, 5); 주소도 똑같 때문에 원본 수정 시 복사본도 같이 수정됨

        System.out.println("=======library======");
        for (Book book : library) {
            System.out.println(book);//ch14.Book@7ad041f3 .....
            book.showInfo();//title0, author0 .....
        }

        System.out.println("=======copyLibrary======");
        for (Book book : copyLibrary) {
            System.out.println(book);//ch14.Book@7ad041f3 .....
            book.showInfo();//title0, author0 .....
        }
    }

}

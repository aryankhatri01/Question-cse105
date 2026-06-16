package Library_System;

public class LibrarySystem {

    public static void main(String[] args) {

        Searchable ebook = new EBook();
        Searchable pbook = new PhysicalBook();

        ebook.search("Java");
        pbook.search("Programming");
    }
}
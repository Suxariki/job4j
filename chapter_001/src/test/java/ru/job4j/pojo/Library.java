package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", 9000);
        Book book1 = new Book("Bible", 850);
        Book book2 = new Book("The Witcher", 900);
        Book book3 = new Book("Clean Code", 1);

        Book[] books = new Book[4];

        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getBookName() + "-" +b.getPages());
        }
        System.out.println("Replace index 0 with index 3");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getBookName() + "-" +b.getPages());
        }

        System.out.println("Show Clean Code book");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getBookName().equals("Clean Code")) {
                System.out.println(b.getBookName() + "-" + b.getPages());
            }
        }
    }
}

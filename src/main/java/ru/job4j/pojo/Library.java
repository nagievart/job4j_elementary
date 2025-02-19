package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book javaBook = new Book("Clean Code", 456);
        Book fantasy = new Book("Chronics of Amber", 1256);
        Book kitchenRecipes = new Book("Redmond Multicooker Recipes", 95);
        Book biography = new Book("Financier", 652);

        Book[] books = new Book[4];
        books[0] = javaBook;
        books[1] = fantasy;
        books[2] = kitchenRecipes;
        books[3] = biography;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Array after replacement of 0 index value with 3 index value");

        books[0] = books[3];
        books[3] = javaBook;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }

        System.out.println("Show results equal to Clean Code");

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
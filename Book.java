/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author Shimi
 */

public class Book {

    static String gen = "Adventure";

    private static int book_Count = 0;
    private String ti;
    private String au;
    private int year;

    public Book(String Title, String Author, int Year) {
        this.ti = Title;
        this.au = Author;
        this.year = Year;
        Book.book_Count++;
    }

    public void display_Book_Details() {
        System.out.println("Title = " + ti);
        System.out.println("Author = " + au);
        System.out.println("Year = " + year);
        System.out.println("Genre = " + gen);
        System.out.println();
    }
    
    public static void display_Book_Count() {
        System.out.println("Total Number of Books = " + book_Count);
    }

    public static void main(String[] args) {

        Book b1 = new Book("Jurrasic Park", "Micheal Crichton", 1989);
        Book b2 = new Book("The Jungle Book", "Rudyard Kipling", 1894);
        Book b3 = new Book("The Lost World", "Arthur Conan Doyle", 1912);

        b1.display_Book_Details();
        b2.display_Book_Details();
        b3.display_Book_Details();
 
        Book.display_Book_Count();
    }
}

package com.sddevops.mavern.eclipse;

import java.util.*;

public class BookList {

    private ArrayList<Book> books = new ArrayList<>();
    private int capacity;

    public BookList() {
    	/*books.add(new Book("Singapore Story","Lim KY","4th Edition",5));
    	books.add(new Book("Travel Travel","G GetGoer","8th Edition",3));
    	books.add(new Book("Henry Potty","J K Hogger","5th Edition",4));
    	books.add(new Book("Julia's Dream","Sally Soon","2nd Edition",2));*/

        this.capacity = 10;
    }

    public BookList(int capacity) {
        this.capacity = capacity;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
    	if(books.size() != capacity) {
    		books.add(book);
    	}
    }
    
    public ArrayList<Book> sortBooksByTitle() {         
        Collections.sort(books, Book.titleComparator);         
        return books;     
    } 
}

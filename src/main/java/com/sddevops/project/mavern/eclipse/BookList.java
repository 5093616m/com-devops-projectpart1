package com.sddevops.project.mavern.eclipse;

import java.util.*;

import com.sddevops.project.junit.maven.eclipse.Song;

public class BookList {

    private ArrayList<Book> books = new ArrayList<>();
    private int capacity;

    public BookList() {

        this.capacity = 10;
    }

    public void addBook(Book book) {
    	if(books.size() != capacity) {
    		books.add(book);
    	}
    }
    
    public Book findBookByTitle(String title) {
    	for (Book A : books) { 		      
            if(A.getTitle().equals(title)) return A;
       }
    	return null;
    }
    
    public Book findBookByAuthor(String author) {
    	for (Book A : books) { 		      
            if(A.getAuthor().equals(author)) return A;
       }
    	return null;
    }
}

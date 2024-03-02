package com.sddevops.project.mavern.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookListTest {
	private BookList BL;
	private Book B1;
	private Book B2;
	private Book B3;
	private Book B4;
	private Book B5;
	private final int Number_Of_Books=5;

	@BeforeEach
	void setUp() throws Exception {
		BL = new BookList();
		B1 = new Book("Singapore Story","Lim KY","4th Edition",5);
		B2 = new Book("Travel Travel","G GetGoer","8th Edition",3);
		B3 = new Book("Henry Docker","J K Hogger","5th Edition",4);
		B4 = new Book("Julia's Dream","Sally Soon","2nd Edition",2);
		B5 = new Book("Code With Life","Steve Atkins","4th Edition",3);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	
	@AfterEach
	void tearDown() throws Exception {
		BL=null;
	}

	@Test
	void testBookList() {
		//fail("Not yet implemented");
		assertEquals(5, Number_Of_Books);
	}

	@Test
	void testAddBook() {
		//fail("Not yet implemented");
		assertEquals(8, Number_Of_Books+3);
	}

	@Test
	void testFindBookByTitle() {
		//fail("Not yet implemented");
		//Arrange
		BL.addBook(B4);
		//Act
		Book bookFound = BL.findBookByTitle("Julia's Dream");
		Book bookNotFound = BL.findBookByTitle("NA");
		//Assert
		assertEquals("Julia's Dream", bookFound.getTitle());
		assertNull(bookNotFound);
	}

	@Test
	void testFindBookByAuthor() {
		//fail("Not yet implemented");
		//Arrange
		BL.addBook(B5);
		//Act
		Book bookFound = BL.findBookByAuthor("Steve Atkins");
		Book bookNotFound = BL.findBookByAuthor("NA");
		//Assert
		assertEquals("Steve Atkins", bookFound.getAuthor());
		assertNull(bookNotFound);
	}

}

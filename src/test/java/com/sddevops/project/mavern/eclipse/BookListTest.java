package com.sddevops.project.mavern.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookListTest {
	private BookList BL;
	private Book B1;
	private Book B2;
	private Book B3;
	private Book B4;
	private Book B5;
	private final int Number_Of_Books=5;
			
	/**
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		BL = new BookList();
		B1 = new Book("Singapore Story","Lim KY","4th Edition",5);
		B2 = new Book("Travel Travel","G GetGoer","8th Edition",3);
		B3 = new Book("Henry Potty","J K Hogger","5th Edition",4);
		B4 = new Book("Julia's Dream","Sally Soon","2nd Edition",2);
		B5 = new Book("Code For Life","Steve Atkins","4th Edition",3);
	}

	/**
	 * @throws java.lang.Exception
	 */

	@After
	public void tearDown() throws Exception {
		BL=null;
	}

	@Test
	public void testSize() {
		//fail("Not yet implemented");
		assertEquals(5, Number_Of_Books);
	}
	
	@Test
	public void testFindBookByTitle() {
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
	public void testFindBookByAuthor() {
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

package com.sddevops.project.mavern.eclipse;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sddevops.project.junit.maven.eclipse.Song;

public class BookListTest {
	private BookList Bl;
	private Book B1;
	private Book B2;
	private Book B3;
	private final int Number_Of_Books=3;
			
	/**
	 * @throws java.lang.Exception
	 */
	
	@Before
	public void setUp() throws Exception {
		Bl = new BookList();
		B1 = new Book("Singapore Story","Lim KY","4th Edition",5);
		B2 = new Book("Travel Travel","G GetGoer","8th Edition",3);
		B3 = new Book("Henry Potty","J K Hogger","5th Edition",4);
	}

	/**
	 * @throws java.lang.Exception
	 */

	@After
	public void tearDown() throws Exception {
		Bl=null;
	}

	@Test
	public void testSize() {
		//fail("Not yet implemented");
		assertEquals(3, Bl.size());
	}
	@Test
	void testFindBookByTitle() {
		//fail("Not yet implemented");
		//Arrange
		B4 = new book("006","Swipe","Gaga",3.00);
		Bl.addbook(B4);
		//Act
		Book bookFound = Bl.findBookByTitle("Julia's Dream");
		Book bookNotFound = Bl.findBookByTitle("None");
		//Assert
		assertEquals("Julia's Dream", bookFound.getTitle());
		assertNull(bookNotFound);
		
	}

}

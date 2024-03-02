package com.sddevops.project.mavern.eclipse;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookListTest {
	private BookList Bl;
	private Book B1;
	private Book B2;
	private Book B3;
			
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
	public void testFindBooksByTitle() {
		//fail("Not yet implemented");
		List<Book> testBl=Bl.get();
		assertEquals(testBl.(),Number_Of_Books);
	}
	
	@Test
	public void testGetBooksByAuthor() {
		//fail("Not yet implemented");
		List<Book> testBl=Bl.getBooks();
		assertEquals(testBl.size(),Number_Of_Books);
	}
	
	@Test
	public void testSortBooksByTitle() {
		//fail("Not yet implemented");
		List<Book> testBl=Bl.getBooks();
		assertEquals(testBl.size(),Number_Of_Books);
	}

}

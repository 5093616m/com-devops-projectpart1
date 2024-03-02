package com.sddevops.project.mavern.eclipse;

import java.util.Comparator;
import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String edition;
	private double quantity;;

	/**
	 * @param title
	 * @param author
	 * @param edition
	 * @param quantity
	 */
	public Book(String title, String author, String edition, double quantity) {
		super();
		this.title = title;
		this.author = author;
		this.edition = edition;
		this.quantity = quantity;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @return the quantity
	 */
	public double getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public static Comparator<Book> titleComparator = new Comparator<Book>() {
		@Override
		public int compare(Book B1, Book B2) {
			return (int) (B1.getTitle().compareTo(B2.getTitle()));
		}
	};

		public static Comparator<Book> authorComparator = new Comparator<Book>() {
		@Override
		public int compare(Book B1, Book B2) {
			return (int) (B1.getAuthor().compareTo(B2.getAuthor()));
		}
	};

}

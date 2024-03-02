package com.sddevops.project.mavern.eclipse;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String edition;
	private double quantity;

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

}

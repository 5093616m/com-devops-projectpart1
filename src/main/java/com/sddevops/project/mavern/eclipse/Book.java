package com.sddevops.project.mavern.eclipse;

public class Book {
	private String title;
	private String author;


	/**
	 * @param title
	 * @param author
	 */
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
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

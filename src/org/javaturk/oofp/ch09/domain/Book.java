package org.javaturk.oofp.ch09.domain;

public class Book implements Comparable {
	private String title;
	private String authorFName;
	private String authorLName;
	private int pages;
	
	public Book() {
		this.title = "No title specified!";
		this.authorFName = "No author first name specified!";
		this.authorLName = "No author last name specified!";
		this.pages = 0;
	}

	public Book(String title, String authorFName, String authorLName, int pages) {
		this.title = title;
		this.authorFName = authorFName;
		this.authorLName = authorLName;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFName() {
		return authorFName;
	}

	public void setAuthorFName(String authorFName) {
		this.authorFName = authorFName;
	}

	public String getAuthorLName() {
		return authorLName;
	}

	public void setAuthorLName(String authorLName) {
		this.authorLName = authorLName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String toString() {
		return getTitle() + " (" + pages + " pages) " + " Written By: " + getAuthorFName() + " " + getAuthorLName() + "\n";
	}

	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return title.compareTo(book.getTitle());
	}

	public void printInfo() {
		System.out.println(" *** Book Info *** ");
		System.out.println(this);
	}
}

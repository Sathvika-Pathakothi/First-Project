package com.lib.model;

public class BookAuthorDTO {
	
	private String bookName;
	private int price;
	private String authorName;
	
	public BookAuthorDTO(String bookName, int price, String authorName) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.authorName = authorName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "BookAuthorDTO [bookName=" + bookName + ", price=" + price + ", authorName=" + authorName + "]";
	}
	
	
	
	
	

}

package com.lib.service;

import java.util.List;

import com.lib.model.Book;
import com.lib.model.BookAuthorDTO;

public interface LibraryService {
	public List<Book> getAllBook();
	public void addBook(Book b);
	public void updateBook(Book b);
	public void deleteBook(int bookId);
	public Book getBookById(int bookId);

}

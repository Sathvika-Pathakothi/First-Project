package cpm.lib.dao;

import java.util.List;

import com.lib.model.Book;
import com.lib.model.BookAuthorDTO;

public interface BookDao {
	public List<Book> getAllBook();
	public void addBook(Book b);
	public void updateBook(Book b);
	public void deleteBook(int bookId);
	public Book getBookById(int bookId);

}

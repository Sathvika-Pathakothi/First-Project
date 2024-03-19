package cpm.lib.dao;

import java.util.ArrayList;
import java.util.List;

import com.lib.model.Book;
import com.lib.model.BookAuthorDTO;



public class BookDaoImpl implements BookDao{
	
	List<Book> booklist;
	public BookDaoImpl() {
		booklist = new ArrayList<Book>();
	      Book book1 = new Book(0, "Comic", 250);
	      Book book2 = new Book(1, "Horror", 300);
	      Book book3 = new Book(2, "Spritual", 400);
	      booklist.add(book1);
	      booklist.add(book2);
	      booklist.add(book3);
	    
	}

	@Override
	public List<Book> getAllBook() {		
		// TODO Auto-generated method stub
		return booklist;
	}

	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		booklist.add(b);
		
	}
	/*@Override
	public void updateBook(Book book) {
		   System.out.println("student in Dao"+book);
	      booklist.get(book.getBookId()).setBookName(book.getBookName());
	
	      System.out.println("Student: Roll No " + book.getBookId() + ", updated with name"+ book.getBookName()+ "in the database");
	}*/


	@Override
	public void deleteBook(int bookId) {
		booklist.remove(bookId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return booklist.get(bookId);
	}

	@Override
	public void updateBook(Book b) {
		System.out.println("Library in dao");
		booklist.get(b.getBookId()).setBookName(b.getBookName());
		System.out.println("Library: [BookId : " + b.getBookId() + ", updated with name " + b.getBookName()+ " in the database");
		// TODO Auto-generated method stub
		
	}
	
	
	

}

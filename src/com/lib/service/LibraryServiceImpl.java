package com.lib.service;

import java.util.List;

import com.lib.model.Book;
import com.lib.model.BookAuthorDTO;


import cpm.lib.dao.BookDao;
import cpm.lib.dao.BookDaoImpl;

public class LibraryServiceImpl implements LibraryService {
	
	BookDao dao;
	
	public LibraryServiceImpl() {
		dao =  new BookDaoImpl();
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return dao.getAllBook();
	}

	@Override
	public void addBook(Book b) {
		dao.addBook(b);
		// TODO Auto-generated method stub
		
		
	}

	/*public void updateBook(Book book) {
		   dao.updateBook(book);
	      System.out.println("Student: Roll No " + book.getBookId() + ", updated in the database");
	   }*/
	

	@Override
	public void deleteBook(int bookId) {
		dao.deleteBook(bookId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBookById(int bookId) {
		// TODO Auto-generated method stub
		return dao.getBookById(bookId);
	}

	@Override
	public void updateBook(Book b) {
		dao.updateBook(b);
		System.out.println("Library: [BookId : " + b.getBookId() + ", update in the database") ;
		//System.out.println("Library: [BookId : " + book.getBookId() + ", BookName : " + book.getBookName() + ", " + "BookPrice : " + book.getPrice() + " ]");
		// TODO Auto-generated method stub
		
	}

	
	
	
	

	
	

}

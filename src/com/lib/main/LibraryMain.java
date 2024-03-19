package com.lib.main;

import java.util.ArrayList;
import java.util.List;

import com.lib.model.Author;
import com.lib.model.Book;
import com.lib.model.BookAuthorDTO;
import com.lib.service.LibraryService;
import com.lib.service.LibraryServiceImpl;





public class LibraryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryService libservice = new LibraryServiceImpl();
		
		List<Book> librarylist = libservice.getAllBook();
		for(Book book : librarylist) {
			System.out.println("Library: [BookId : " + book.getBookId() + ", BookName : " + book.getBookName() + ", " + "BookPrice : " + book.getPrice() + " ]");
		}
		
		Book b = libservice.getAllBook().get(0);
		b.setBookName("Ramayanam");
		libservice.updateBook(b);
		

	    Book s1=new Book(4, "Quran", 500);
	    libservice.addBook(s1);
	    System.out.println("After calling add");
	    for (Book std : libservice.getAllBook()) {
		       System.out.println("Library: [BookId : " + std.getBookId() + ", BookName : " + std.getBookName() + ", " + "BookPrice : " + std.getPrice() + " ]");
		   }
	    
	    
	    System.out.println("After Deleting");
	    int id = 0;
	    libservice.deleteBook(id);
	    List<Book> booklist=libservice.getAllBook();
	    
	    for(Book books : booklist) {
			System.out.println("Library: [BookId : " + books.getBookId() + ", BookName : " + books.getBookName() + ", " + "BookPrice : " + books.getPrice() +" ]");
		}
	    Author name1 = new Author("RuskinBond");
	    Author name2 = new Author("Arthur conan doyle");
	    Author name3 = new Author("Salman  Rushdie");
	    List<Author> authorlist = new ArrayList<Author>();
	    authorlist.add(name1);
	    authorlist.add(name2);
	    authorlist.add(name3);
	    
	    List<BookAuthorDTO> newlist = new ArrayList<BookAuthorDTO>();
	    newlist.add(new BookAuthorDTO(librarylist.get(0).getBookName(),librarylist.get(0).getPrice(),authorlist.get(0).getAuthorName()));
	    newlist.add(new BookAuthorDTO(librarylist.get(1).getBookName(),librarylist.get(1).getPrice(),authorlist.get(1).getAuthorName()));
	    newlist.add(new BookAuthorDTO(librarylist.get(2).getBookName(),librarylist.get(2).getPrice(),authorlist.get(2).getAuthorName()));
	    
	    
	    for(BookAuthorDTO dtodata:newlist) {
			   System.out.println(dtodata.getBookName() + " "+dtodata.getPrice() + " " + dtodata.getAuthorName());
		   }	    
	}

}

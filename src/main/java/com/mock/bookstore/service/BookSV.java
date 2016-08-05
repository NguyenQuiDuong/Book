package com.mock.bookstore.service;

import com.mock.bookstore.model.BookDetail;
import com.mock.bookstore.model.BookType;

import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public interface BookSV {

	void addBook(BookDetail bookDetail);
	
	List<BookDetail> listBook();
	
	void addBookType(BookType bookType);
	List<BookType> listBookType();
}

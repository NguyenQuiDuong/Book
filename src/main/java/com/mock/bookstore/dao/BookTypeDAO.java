package com.mock.bookstore.dao;

import com.mock.bookstore.model.BookType;

import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public interface BookTypeDAO {
	void addBookType(BookType bookType);
	List <BookType> listBookType();
}

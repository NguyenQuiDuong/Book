package com.mock.bookstore.dao;

import com.mock.bookstore.model.BookDetail;

import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public interface BookDAO {
	void addBook(BookDetail bookDetail);
	List <BookDetail> listBook();
}

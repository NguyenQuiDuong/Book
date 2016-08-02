package com.mock.bookstore.service;

import com.mock.bookstore.model.BookDetail;

import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public interface BookSV {

	void addBook(BookDetail bookDetail);

	List<BookDetail> listBook();
}

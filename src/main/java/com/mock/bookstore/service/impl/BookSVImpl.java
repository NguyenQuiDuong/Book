package com.mock.bookstore.service.impl;

import com.mock.bookstore.dao.BookDAO;
import com.mock.bookstore.model.BookDetail;
import com.mock.bookstore.service.BookSV;

import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public class BookSVImpl implements BookSV {

	BookDAO bookDAO;

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public List<BookDetail> listBook() {
		List<BookDetail> list = bookDAO.listBook();
		if(list.size() > 0){
			int i=0;
		}
		return bookDAO.listBook();
	}

	public void addBook(BookDetail bookDetail) {
		bookDAO.addBook(bookDetail);
	}
}

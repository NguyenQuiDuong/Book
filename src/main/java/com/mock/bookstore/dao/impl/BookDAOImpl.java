package com.mock.bookstore.dao.impl;

import com.mock.bookstore.dao.BookDAO;
import com.mock.bookstore.model.BookDetail;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {


	public List<BookDetail> listBook() {
		String query = "from BookDetail bd, Author a,BookStore bs,BookType bt where bd.bookStore=bs.id"
				+ " and bd.author=a.id"
				+ " and bd.bookType = bt.id";
		List list = getHibernateTemplate().find(query);
		return list;
	}

	public void addBook(BookDetail bookDetail) {
		getHibernateTemplate().save(bookDetail);
	}
}

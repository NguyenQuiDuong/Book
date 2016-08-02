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
		List list = getHibernateTemplate().find("FROM BookDetail ");
		if(list.size() > 0){
			for (int i= 0; i<list.size();i++){
				System.out.println(list.get(i).toString());
			}
		}
		return list;
	}

	public void addBook(BookDetail bookDetail) {
		getHibernateTemplate().save(bookDetail);
	}
}

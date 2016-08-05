package com.mock.bookstore.dao.impl;

import com.mock.bookstore.dao.BookTypeDAO;
import com.mock.bookstore.model.BookType;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ace on 02-Aug-16.
 */
public class BookTypeDAOImpl extends HibernateDaoSupport implements BookTypeDAO {


	public List<BookType> listBookType() {
		List list = getHibernateTemplate().find("FROM BookType");
		if(list.size() > 0){
			for (int i= 0; i<list.size();i++){
				System.out.println(list.get(i).toString());
			}
		}
		return list;
	}

	public void addBookType(BookType bookType) {
		getHibernateTemplate().save(bookType);
	}
}

package com.mock.bookstore.action;

import com.mock.bookstore.model.BookDetail;
import com.mock.bookstore.service.BookSV;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ace on 01-Aug-16.
 */
public class IndexAction implements ModelDriven {

	BookDetail bookDetail = new BookDetail();
	List<BookDetail> bookDetailList  = new ArrayList<BookDetail>();

	BookSV bookSV;

	public void setBookSV(BookSV bookSV) {
		this.bookSV = bookSV;
	}

	public Object getModel() {
		return  bookDetail;
	}

	public List<BookDetail> getBookDetailList() {
		return bookDetailList;
	}

	public void setBookDetailList(List<BookDetail> bookDetailList) {
		this.bookDetailList = bookDetailList;
	}

	public String listBook(){
		bookDetailList = bookSV.listBook();
		return "success";
	}
	
	public String addBookDetail() throws Exception{
		
		//save it
		bookDetail.setPublicedYear(new Date());
		bookSV.addBook(bookDetail);
	 
		//reload the book list
		bookDetailList = null;
		bookDetailList = bookSV.listBook();
		
		return "success";
	
	}
}

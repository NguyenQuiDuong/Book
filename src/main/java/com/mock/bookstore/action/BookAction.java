package com.mock.bookstore.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mock.bookstore.model.BookDetail;
import com.mock.bookstore.model.BookType;
import com.mock.bookstore.service.BookSV;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction implements ModelDriven{
	BookDetail bookDetail = new BookDetail();
	List<BookDetail> bookDetailList  = new ArrayList<BookDetail>();
	BookSV bookSV;

	BookType bookType = new BookType();
	List<BookType> bookTypeList = new ArrayList<BookType>();
	
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

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public List<BookType> getBookTypeList() {
		return bookTypeList;
	}

	public void setBookTypeList(List<BookType> bookTypeList) {
		this.bookTypeList = bookTypeList;
	}
	
	public String listBookType() {
		bookTypeList = bookSV.listBookType();
		return "success";
	}
	
	
}

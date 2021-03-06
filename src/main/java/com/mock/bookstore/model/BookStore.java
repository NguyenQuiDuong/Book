// default package
// Generated Aug 4, 2016 3:39:00 PM by Hibernate Tools 4.3.1.Final
package com.mock.bookstore.model;

import java.util.HashSet;
import java.util.Set;

/**
 * BookStore generated by hbm2java
 */
public class BookStore implements java.io.Serializable {

	private Integer id;
	private String bookId;
	private Integer quantity;
	private Float enterPrice;
	private Float unitPrice;
	private Float disscountPrice;
	private Set<BookDetail> bookDetails = new HashSet<BookDetail>(0);

	public BookStore() {
	}

	public BookStore(String bookId) {
		this.bookId = bookId;
	}

	public BookStore(String bookId, Integer quantity, Float enterPrice, Float unitPrice, Float disscountPrice,
			Set<BookDetail> bookDetails) {
		this.bookId = bookId;
		this.quantity = quantity;
		this.enterPrice = enterPrice;
		this.unitPrice = unitPrice;
		this.disscountPrice = disscountPrice;
		this.bookDetails = bookDetails;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getEnterPrice() {
		return this.enterPrice;
	}

	public void setEnterPrice(Float enterPrice) {
		this.enterPrice = enterPrice;
	}

	public Float getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Float getDisscountPrice() {
		return this.disscountPrice;
	}

	public void setDisscountPrice(Float disscountPrice) {
		this.disscountPrice = disscountPrice;
	}

	public Set<BookDetail> getBookDetails() {
		return this.bookDetails;
	}

	public void setBookDetails(Set<BookDetail> bookDetails) {
		this.bookDetails = bookDetails;
	}

}

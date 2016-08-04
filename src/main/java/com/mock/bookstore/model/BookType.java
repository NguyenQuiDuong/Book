// default package
// Generated Aug 4, 2016 3:39:00 PM by Hibernate Tools 4.3.1.Final
package com.mock.bookstore.model;

import java.util.HashSet;
import java.util.Set;

/**
 * BookType generated by hbm2java
 */
public class BookType implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Set<BookDetail> bookDetails = new HashSet<BookDetail>(0);

	public BookType() {
	}

	public BookType(String name) {
		this.name = name;
	}

	public BookType(String name, String description, Set<BookDetail> bookDetails) {
		this.name = name;
		this.description = description;
		this.bookDetails = bookDetails;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<BookDetail> getBookDetails() {
		return this.bookDetails;
	}

	public void setBookDetails(Set<BookDetail> bookDetails) {
		this.bookDetails = bookDetails;
	}

}

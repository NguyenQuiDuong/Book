// default package
// Generated Aug 4, 2016 3:39:00 PM by Hibernate Tools 4.3.1.Final
package com.mock.bookstore.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Author generated by hbm2java
 */
public class Author implements java.io.Serializable {

	private Integer id;
	private String name;
	private String dob;
	private String address;
	private String story;
	private Set<BookDetail> bookDetails = new HashSet<BookDetail>(0);

	public Author() {
	}

	public Author(String name, String dob, String address, String story, Set<BookDetail> bookDetails) {
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.story = story;
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

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStory() {
		return this.story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public Set<BookDetail> getBookDetails() {
		return this.bookDetails;
	}

	public void setBookDetails(Set<BookDetail> bookDetails) {
		this.bookDetails = bookDetails;
	}

}

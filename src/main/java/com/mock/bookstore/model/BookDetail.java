package com.mock.bookstore.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ace on 02-Aug-16.
 */
public class BookDetail implements Serializable {
	private String id;
	private String name;
	private Integer authorId;
	private Integer typeId;
	private Integer storeId;
	private String description;
	private Date publicedYear;
	private Integer producerId;

	public BookDetail(){};

	public BookDetail(String id, String name, int authorId, int typeId, int storeId,String description,Date publicedYear,int producerId){
		this.id = id;
		this.name = name;
		this.authorId = authorId;
		this.typeId = typeId;
		this.storeId = storeId;
		this.description = description;
		this.publicedYear = publicedYear;
		this.producerId = producerId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublicedYear() {
		return publicedYear;
	}

	public void setPublicedYear(Date publicedYear) {
		this.publicedYear = publicedYear;
	}

	public Integer getProducerId() {
		return producerId;
	}

	public void setProducerId(Integer producerId) {
		this.producerId = producerId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BookDetail that = (BookDetail) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (authorId != null ? !authorId.equals(that.authorId) : that.authorId != null) return false;
		if (typeId != null ? !typeId.equals(that.typeId) : that.typeId != null) return false;
		if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (publicedYear != null ? !publicedYear.equals(that.publicedYear) : that.publicedYear != null) return false;
		if (producerId != null ? !producerId.equals(that.producerId) : that.producerId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
		result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
		result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (publicedYear != null ? publicedYear.hashCode() : 0);
		result = 31 * result + (producerId != null ? producerId.hashCode() : 0);
		return result;
	}
}

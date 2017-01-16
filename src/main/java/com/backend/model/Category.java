package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
	@Id@GeneratedValue
	private int categoryId;
	private String CategoryName;
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	
	

}

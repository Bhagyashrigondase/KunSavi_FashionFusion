package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class ProductCategory extends BaseEntity {
	@Column(length = 30)
	private String cname;

	public ProductCategory() {
		super();
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "ProductCategory [cname=" + cname + "]";
	}

	public ProductCategory(String cname) {
		super();
		this.cname = cname;
	}
	
	

}

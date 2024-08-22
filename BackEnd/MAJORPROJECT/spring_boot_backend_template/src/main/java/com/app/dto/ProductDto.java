package com.app.dto;

public class ProductDto extends BaseDto {
	private String pname;
	private String description;
	private int stock;
	private double price;
	private String genderType;
	
	
	private Long category_id;


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	

	public String getGenderType() {
		return genderType;
	}


	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	public ProductDto(Long category_id) {
		super();
		this.category_id = category_id;
	}


	public Long getCategory_id() {
		return category_id;
	}


	public void setCategory_Id(Long category_id) {
		this.category_id = category_id;
	}


	public ProductDto() {
		super();
	}


//	public ProductDto(String pname, String description, int stock, double price, String genderType,
//			ProductCategory category) {
//		super();
//		this.pname = pname;
//		this.description = description;
//		this.stock = stock;
//		this.price = price;
//		this.genderType = genderType;
//		this.category = category;
//	}


	@Override
	public String toString() {
		return "ProductDto [pname=" + pname + ", description=" + description + ", stock=" + stock + ", price=" + price
				+ ", genderType=" + genderType + ", category=" + category_id + "]";
	}
		

}

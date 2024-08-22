package com.app.dto;

public class BaseDto {
	
	private Long id;
	
	public BaseDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BaseDto(Long id) {
		super();
		this.id = id;
	}
	
	

}

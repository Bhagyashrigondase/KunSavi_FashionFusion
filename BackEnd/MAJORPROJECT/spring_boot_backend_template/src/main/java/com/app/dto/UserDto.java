package com.app.dto;



import com.app.entities.Role;

public class UserDto extends BaseDto {
	
	private String name;
	private String email;
	
	private Role role;
	private String mobileno;
	private String address;
	private String zipcode;
	private String city;
	private String state;
	
	
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserDto [name=" + name + ", email=" + email + ", role=" + role + ", mobileno=" + mobileno + ", address="
				+ address + ", zipcode=" + zipcode + ", city=" + city + ", state=" + state + "]";
	}

	public UserDto(String name, String email, Role role, String mobileno, String address, String zipcode, String city,
			String state) {
		super();
		this.name = name;
		this.email = email;
		this.role = role;
		this.mobileno = mobileno;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}

	
	
	
	
	
	
	
	

}

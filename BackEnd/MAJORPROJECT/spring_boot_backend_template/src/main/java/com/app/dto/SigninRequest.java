package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


public class SigninRequest {
	
	@NotEmpty(message = "Email can't be blank")
	@Email(message = "Invalid email format")
	private String email;
	@NotEmpty
	@Length(min = 3,max=20,message = "Invalid password length")
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public SigninRequest(
			@NotEmpty(message = "Email can't be blank") @Email(message = "Invalid email format") String email,
			@NotEmpty @Length(min = 3, max = 20, message = "Invalid password length") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public SigninRequest() {
		super();
	}
	
	
}

package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.Signup;
import com.app.dto.UserDto;
import com.app.entities.User;

public interface UserService {
	
	List<UserDto> getAllUsers();
	
	//UserDto addNewUser(UserDto newuser);
	
	ApiResponse deleteUser(Long userId);
	
	User addNewUser(User newuser);
	
	//UserDto getUserDetails(Long id);
	User getUserDetails(Long id);
	
	ApiResponse updateUser(User u);
	//Signup userRegistration(Signup reqDTO);
	
	User authenticate(String email, String password);

}

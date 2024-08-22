package com.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.User;
import com.app.services.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> loginData)
	{
		 String email = loginData.get("email");
	     String password = loginData.get("password");
		return ResponseEntity.ok(service.authenticate(email, password));
		
	}
	
	@GetMapping("/getusers")
	public ResponseEntity<?> getAllUsers()
	{
		return ResponseEntity.ok(service.getAllUsers());
		
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<?> addNewUser(@RequestBody User newuser)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(service.addNewUser(newuser));
	}
	
	@CrossOrigin("*")
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id)
	{
		return ResponseEntity.ok(service.deleteUser(id));
	}
	
	@GetMapping("/getuserdetails/{id}")
	public ResponseEntity<?> getuserdetails(@PathVariable Long id)
	{
		return ResponseEntity.ok(service.getUserDetails(id));
		
	}
	
	@PutMapping("/updateuser")
	public ResponseEntity<?> updateUser(@RequestBody User u)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateUser(u));
		
	}
}

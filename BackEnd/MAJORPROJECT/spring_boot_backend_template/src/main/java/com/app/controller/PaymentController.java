package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Payment;
import com.app.services.PaymentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@PostMapping("/addnewpayment")
	public ResponseEntity<?> addNewPayment(@RequestBody Payment payment)
	{
		return  ResponseEntity.status(HttpStatus.CREATED)
				.body(service.addNewPayment(payment));
	}
	
	@DeleteMapping("/deletepayment/{id}")
	public ResponseEntity<?> deletePayment(@PathVariable Long id)
	{
		return ResponseEntity.ok(service.deletePayment(id));
	}
	

}

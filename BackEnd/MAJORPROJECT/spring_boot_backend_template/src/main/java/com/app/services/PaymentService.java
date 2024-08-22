package com.app.services;

import com.app.dto.ApiResponse;
import com.app.entities.Payment;

public interface PaymentService {
	
	public Payment addNewPayment(Payment payment);
	
	public ApiResponse deletePayment(Long id);

}

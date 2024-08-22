package com.app.services;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.entities.Payment;
import com.app.repositories.PaymentRepository;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepository repo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Payment addNewPayment(Payment payment) {
		
		return repo.save(payment);
	}

	@Override
	public ApiResponse deletePayment(Long id) {
		
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return new ApiResponse("Payment deleted!!");
		}
		return new ApiResponse("Payment not deleted!!");
	}
	
	

}

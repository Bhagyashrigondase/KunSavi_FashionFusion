package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment extends BaseEntity {
	
	private double amount;
	private LocalDate paymentDate;
	@Enumerated(EnumType.STRING)
	private PaymentMode mode;
	
	public Payment() {
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public PaymentMode getMode() {
		return mode;
	}

	public void setMode(PaymentMode mode) {
		this.mode = mode;
	}

	public Payment(double amount, LocalDate paymentDate, PaymentMode mode) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Payment [amount=" + amount + ", paymentDate=" + paymentDate + ", mode=" + mode + "]";
	}

	
	

}

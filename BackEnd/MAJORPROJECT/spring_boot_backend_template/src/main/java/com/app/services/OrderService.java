package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.OrderDto;
import com.app.entities.Order;

public interface OrderService {
	
	List<OrderDto> getAllOrders();
	
	ApiResponse deleteOrder(Long id);
	
	//Order addNewOrder(Order r);
	ApiResponse addNewOrder(OrderDto newOrder);
	
	Order getOrderDetails(Long id);
	
	ApiResponse updateOrder(Order uporder);

}

package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.CartItemDto;
import com.app.entities.CartItems;

public interface CartItemsService {
	
	CartItems addNewCartItems(CartItems newitem);
	
	ApiResponse deleteCartItem(Long id);
	
	ApiResponse updateCartItems(CartItems upitem);
	
	List<CartItemDto> getAllCartItems();
	

}

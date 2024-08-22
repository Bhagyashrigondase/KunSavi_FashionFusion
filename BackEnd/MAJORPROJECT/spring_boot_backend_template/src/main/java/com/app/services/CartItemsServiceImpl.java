package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.dto.CartItemDto;
import com.app.entities.CartItems;
import com.app.exceptions.ResourceNotFoundException;
import com.app.repositories.CartItemsRepository;

@Service
@Transactional
public class CartItemsServiceImpl implements CartItemsService {
	
	@Autowired
	private CartItemsRepository repo;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public CartItems addNewCartItems(CartItems newitem) {
		return repo.save(newitem);
	}

	@Override
	public ApiResponse deleteCartItem(Long id) {
		CartItems delcartitem=repo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("Invalid CartItem id"));
		repo.delete(delcartitem);
		return new ApiResponse("CartItem with id "+delcartitem.getId()+" deleted");
	}

	@Override
	public ApiResponse updateCartItems(CartItems upitem) {
		if(repo.existsById(upitem.getId()))
        {
		repo.save(upitem);
		return new ApiResponse("CartItem with id "+upitem.getId()+" updated successfully!!");
        }
		return new ApiResponse("Updation failed!!");
	}

	@Override
	public List<CartItemDto> getAllCartItems() {
		return repo.findAll()
				.stream()
				.map(items->mapper.map(items, CartItemDto.class))
				.collect(Collectors.toList());
	}

}

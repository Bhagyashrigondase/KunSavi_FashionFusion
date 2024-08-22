package com.app.services;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.ProductDto;
import com.app.entities.Product;

public interface ProductService {
	
	List<ProductDto> getAllProducts();
	
    ApiResponse deleteProduct(Long productId);
	
	//Product addNewProduct(Product newproduct);
     ApiResponse addNewProduct(ProductDto newProduct);
	
	//UserDto getUserDetails(Long id);
	Product getProductDetails(Long id);
	
	ApiResponse updateProduct(Product p);
	
	List<ProductDto> getProductsByGender(String genderType);


}

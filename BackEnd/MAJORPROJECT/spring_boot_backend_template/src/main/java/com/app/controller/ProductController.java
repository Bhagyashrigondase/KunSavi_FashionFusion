package com.app.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDto;
import com.app.entities.Product;
import com.app.services.ProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/getproducts")
	public ResponseEntity<?> getAllProducts()
	{
		return ResponseEntity.ok(service.getAllProducts());
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public ResponseEntity<?> deleteProducts(@PathVariable Long id)
	{
		return ResponseEntity.ok(service.deleteProduct(id));
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> addProduct(@RequestBody ProductDto newproduct)
	{
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(service.addNewProduct(newproduct));
	}
	
	@GetMapping("/getproductdetail/{id}")
	public ResponseEntity<?> getProductDetails(@PathVariable Long id)
	{
		return ResponseEntity.ok(service.getProductDetails(id));
	}
	
	@PutMapping("/updateproduct")
	public ResponseEntity<?> updateProduct(@RequestBody Product p)
	{
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateProduct(p));
	}
	
	@GetMapping("/products/gender")
    public ResponseEntity<List<ProductDto>> getProductsByGender(@RequestParam String genderType) {
        List<ProductDto> products = service.getProductsByGender(genderType);
        
        if (products.isEmpty()) {
            // Return a 204 No Content if no products are found
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        // Return a 200 OK with the list of products
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}

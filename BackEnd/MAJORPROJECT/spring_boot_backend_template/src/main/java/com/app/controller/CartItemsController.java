package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.CartItems;
import com.app.services.CartItemsService;

@RestController
@RequestMapping("/cartitems")
public class CartItemsController {
        @Autowired
        private CartItemsService service;
        
        @GetMapping("/getallcartitems")
        public ResponseEntity<?> getAllCartItems()
        {
        	return ResponseEntity.ok(service.getAllCartItems());
        }
        
        @DeleteMapping("/deleteitems/{id}")
        public ResponseEntity<?> deleteCartItems(@PathVariable Long id)
        {
        	return ResponseEntity.ok(service.deleteCartItem(id));
        }
        
        @PostMapping("/addcartitems")
        public ResponseEntity<?> addCartItems(@RequestBody CartItems item)
        {
        	return ResponseEntity.status(HttpStatus.CREATED)
    				.body(service.addNewCartItems(item));
        	
        }
        
        @PutMapping("/updatecartitems")
        public ResponseEntity<?> updateCartItems(@RequestBody CartItems upitem)
        {
        	return ResponseEntity.status(HttpStatus.ACCEPTED).body(service.updateCartItems(upitem));
        	
        }
}

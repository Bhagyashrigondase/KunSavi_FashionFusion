package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.CartItems;

public interface CartItemsRepository extends JpaRepository<CartItems, Long> {

}

package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product,Long> {
	
	List<Product> findByGenderType(String genderType);

}

package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}

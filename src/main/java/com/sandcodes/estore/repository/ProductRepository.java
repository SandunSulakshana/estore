package com.sandcodes.estore.repository;

import com.sandcodes.estore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

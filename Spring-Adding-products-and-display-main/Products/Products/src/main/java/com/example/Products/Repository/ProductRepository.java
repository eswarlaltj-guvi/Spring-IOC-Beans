package com.example.Products.Repository;

import com.example.Products.Entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDetails,Long>{
}

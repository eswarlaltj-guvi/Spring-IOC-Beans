package com.example.Products.Service;

import com.example.Products.Entity.ProductDetails;
import com.example.Products.ProductsApplication;
import com.example.Products.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class ProductService
{
    private ProductRepository productRepository;

    public ProductDetails savedata(ProductDetails productDetails)
    {
      return   productRepository.save(productDetails);
    }

    public List<ProductDetails> getallproduct()
    {

        return productRepository.findAll();
    }
}

package com.telusko.SimpleWebApp.Services;

import com.telusko.SimpleWebApp.Models.Products;
import com.telusko.SimpleWebApp.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
//    List<Products>products= Arrays.asList(new Products(101,"iphone",50000),
//                                          new Products(102,"honk",70000),
//                                          new Products(103,"camera",30000));
//

    public List<Products> getProducts() {
        return productRepo.findAll();
    }

    public Products getProductById(int prodId){

        return productRepo.findById(prodId).orElse(new Products());

    }

    public void addProduct(Products products){
        productRepo.save(products);
    }

    public void updateProduct(Products products){
        productRepo.save(products);
    }

    public void deleteProduct(int prodId){
        productRepo.deleteById(prodId);
    }

}

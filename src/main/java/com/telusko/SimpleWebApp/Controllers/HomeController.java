package com.telusko.SimpleWebApp.Controllers;

import com.telusko.SimpleWebApp.Models.Products;
import com.telusko.SimpleWebApp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class HomeController {
    @Autowired
    ProductService productService;
    @RequestMapping("/")
    public String greet(){
        return "Welcome to my site";
    }

    @GetMapping("/products")
    public List<Products> getProducts(){
       return productService.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Products getProductbyId(@PathVariable int prodId){
       return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products products){
        productService.addProduct(products);
        }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Products products){
        productService.updateProduct(products);
    }

}



package com.example.salemwebser.controller;

import com.example.salemwebser.entity.Product;
import com.example.salemwebser.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "productController")
public class ProductController {
    private final ProductService productservice;

    @Autowired
    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    @GetMapping
    public List<Product> getProduct() {
        return productservice.getProduct();
    }

    @GetMapping(path = "{ProductId}")
    public Product getProductByID(@PathVariable int ProductId) {
        return productservice.getProductById(ProductId);
    }

    @PostMapping
    public void addNewProduct(@RequestBody Product product) {
        productservice.addNewProduct(product);
    }

    @DeleteMapping(path = "{ProductId}")
    public void deleteProduct(@PathVariable("ProductId") int ProductId) {
        productservice.deleteProduct(ProductId);
    }

    @PutMapping(path = "{ProductId}")
    public void updateProduct(
            @PathVariable("ProductId") int ProductId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String slug,
            @RequestParam(required = false) String reference,
            @RequestParam(required = false) double price,
            @RequestParam(required = false) double vat,
            @RequestParam(required = false) boolean stockAble
            ) {
        productservice.updateProduct(ProductId, name, slug, reference,price,vat,stockAble);
    }
}
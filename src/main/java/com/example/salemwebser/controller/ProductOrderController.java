package com.example.salemwebser.controller;



import com.example.salemwebser.entity.ProductOrder;
import com.example.salemwebser.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "productOrderController")
public class ProductOrderController {
    private final ProductOrderService productOrderService;
    @Autowired
    public ProductOrderController(ProductOrderService productOrderService) {
        this.productOrderService = productOrderService;
    }
    @GetMapping
    public List<ProductOrder> getCustomers()
    {
        return productOrderService.getProductOrder();
    }
    @GetMapping(path="{productId}")
    public ProductOrder getProductOrderByID(@PathVariable int productId)
    {
        return productOrderService.getProductOrderById(productId);
    }
    @PostMapping
    public void addNewProductOrder(@RequestBody ProductOrder productorder) {
        productOrderService.addNewProductOrder(productorder);
    }
    @DeleteMapping(path = "{productId}")
    public void deleteProductOrder(@PathVariable("productId") int productId) {
        productOrderService.deleteProductOrder(productId);
    }

    @PutMapping(path = "{productId}")
    public void updateProductOrder(
            @PathVariable("productId") int productId,
            @RequestParam(required = false) int quantity,
            @RequestParam(required = false) double price,
            @RequestParam(required = false) double vat

            )
    {
        productOrderService.updateProductOrder(productId,quantity,price,vat);
    }

}


package com.example.salemwebser.service;


import com.example.salemwebser.entity.ProductOrder;
import com.example.salemwebser.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductOrderService {
    private final ProductOrderRepository productorderRepository;
    @Autowired
    public ProductOrderService(ProductOrderRepository productorderRepository) {
        this.productorderRepository = productorderRepository;
    }
    public List<ProductOrder> getProductOrder()
    {
        return productorderRepository.findAll();
    }

    public void addNewProductOrder(ProductOrder productorder) {
        productorderRepository.save(productorder);
    }
    public ProductOrder getProductOrderById(int id){
        boolean exist =  productorderRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("product order with id "+ id +" dose not exist");
        return productorderRepository.findById(id);
    }
    public void deleteProductOrder(int ProductOrderID) {

        boolean exist =  productorderRepository.existsById(ProductOrderID);
        if(!exist)
            throw new IllegalStateException("Product Order with id "+ ProductOrderID +" dose not exist");
        productorderRepository.deleteById(ProductOrderID);
    }
    @Transactional
    public void updateProductOrder(int productId, int quantity ,double price ,double vat) {

        ProductOrder productorder = productorderRepository.findById(productId);


productorder.setProductId(productId);
productorder.setQuantity(quantity);
productorder.setPrice(price);
productorder.setVat(vat);

    }
}
package com.example.salemwebser.service;




import com.example.salemwebser.entity.Product;
import com.example.salemwebser.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getProduct()
    {
        return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }
    public Product getProductById(int id){
        boolean exist =  productRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("product with id "+ id +" dose not exist");
        return productRepository.findByProductId(id);
    }
    public void deleteProduct(int productID) {

        boolean exist =  productRepository.existsById(productID);
        if(!exist)
            throw new IllegalStateException("product with id "+ productID +" dose not exist");
        productRepository.deleteById(productID);
    }
    @Transactional
    public void updateProduct(int productID,String name, String slug,String reference,double price,double vat ,boolean stockAble) {

        Product product = productRepository.findById(productID).orElseThrow(()->new IllegalStateException(
                "product with id "+ productID+" dose not exist"
        ));

        product.setName(name);
        product.setPrice(price);
        product.setSlug(slug);
        product.setReference(reference);
        product.setStockAble(stockAble);
        product.setVat(vat);


    }
}

package com.springboot.blog.service;

import com.springboot.blog.entity.Stoke;

import com.springboot.blog.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StockService {
    private final StockRepository stockRepository;
    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    public List<Stoke> getStock()
    {
        return stockRepository.findAll();
    }

    public void addNewStock(Stoke stock) {
        stockRepository.save(stock);
    }
    public Stoke getStokeById(int id){
        boolean exist =  stockRepository.existsById(id);
        if(!exist)
            throw new IllegalStateException("stock with id "+ id +" dose not exist");
        return stockRepository.findByStokeID(id);
    }
    public void deleteStock(int stockID) {

        boolean exist =  stockRepository.existsById(stockID);
        if(!exist)
            throw new IllegalStateException("Stock with id "+ stockID +" dose not exist");
        stockRepository.deleteById(stockID);
    }
    @Transactional
    public void updateStock(int stockID,int productId, int quantity , String updateAtDateTime) {

        Stoke stock = stockRepository.findById(stockID).orElseThrow(()->new IllegalStateException(
                "Stock with id "+ stockID+" dose not exist"
        ));
        stock.setProductId(productId);
        stock.setQuantity(quantity);
        stock.setUpdateAtDateTime(updateAtDateTime);


    }
}

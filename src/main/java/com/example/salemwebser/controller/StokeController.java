package com.example.salemwebser.controller;


import com.example.salemwebser.entity.Stoke;
import com.example.salemwebser.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "stokeController")
public class StokeController {
    private final StockService stockService;
    @Autowired
    public StokeController(StockService stockService) {
        this.stockService = stockService;
    }
    @GetMapping
    public List<Stoke> getStoke()
    {
        return stockService.getStock();
    }
    @GetMapping(path="{stockId}")
    public Stoke getStockByID(@PathVariable int stockId)
    {
        return stockService.getStokeById(stockId);
    }
    @PostMapping
    public void addNewStoke(@RequestBody Stoke stoke) {
        stockService.addNewStock(stoke);
    }
    @DeleteMapping(path = "{stockId}")
    public void deleteStoke(@PathVariable("stockId") int stockId) {
        stockService.deleteStock(stockId);
    }

    @PutMapping(path = "{stockId}")
    public void updateProductOrder(
            @PathVariable("stockId") int stockId,
            @RequestParam(required = false) int quantity,
            @RequestParam(required = false) String updateAtDateTime

    )
    {
        stockService.updateStock(stockId,quantity,updateAtDateTime);
    }

}

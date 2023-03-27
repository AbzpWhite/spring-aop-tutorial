package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductRepo {
    
    public String getProductName(){
        log.info("Received request for product name");

        return "Product one";
    }
}

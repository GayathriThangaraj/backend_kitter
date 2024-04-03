package com.example.pet_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pet_shop.model.Shop;

public interface ShopRepo extends JpaRepository<Shop,String>{
    
}

package com.ankur.myshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.myshop.dto.ShoppingOrder;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {

}

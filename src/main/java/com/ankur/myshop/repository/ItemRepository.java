package com.ankur.myshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.myshop.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>
{

}

package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.aspectj.apache.bcel.Repository;

import java.util.List;

@Repository
public interface ItemDao extends CrudRepository<Item, Integer> {
    List<Item> findByProduct(Product product);
}
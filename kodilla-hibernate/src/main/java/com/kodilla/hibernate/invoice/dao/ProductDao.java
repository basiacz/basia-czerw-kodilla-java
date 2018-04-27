package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import javax.annotation.Resource;
import java.util.List;

@Resource
public interface ProductDao extends CrudRepository <Product, Integer>{
    List<Product> findByName (String name);
}
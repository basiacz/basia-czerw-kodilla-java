package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.invoice.dao.CrudRepository;
import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CompanyDao extends CrudRepository<Company, Integer> {
    List<Company> searchByName (String name);
}
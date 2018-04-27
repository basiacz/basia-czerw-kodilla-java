package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.invoice.dao.CrudRepository;
import com.kodilla.hibernate.manytomany.Employee;
import com.mysql.cj.api.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> searchByLastName(String lastname);
}
package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDao extends CrudRepository <Invoice, Integer> {
    List<Invoice> findByNumber(String number);
}
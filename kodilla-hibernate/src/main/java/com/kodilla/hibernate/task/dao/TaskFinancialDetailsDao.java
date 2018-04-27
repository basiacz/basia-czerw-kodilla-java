package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.invoice.dao.CrudRepository;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
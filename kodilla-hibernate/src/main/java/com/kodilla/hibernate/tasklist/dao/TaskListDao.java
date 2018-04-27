package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.invoice.dao.CrudRepository;
import com.kodilla.hibernate.tasklist.TaskList;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList,Integer> {
    List<TaskList> findByListName(String listName);
    void delete(Integer id);
}
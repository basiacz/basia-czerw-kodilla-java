package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration (int duration);

    List<Task> retrieveLongTasks();

    List<Task> retrieveShortTasks();

    List<Task> retrieveTasksWithEnoughTime();

    List<Task> retrieveTasksWithDurationLongerThan(int duration);
}
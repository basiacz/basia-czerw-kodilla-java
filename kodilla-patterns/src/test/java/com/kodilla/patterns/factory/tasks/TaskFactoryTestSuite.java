package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateTask() {
        //given

        //when
        Task result = TaskFactory.createTask(TaskFactory.DRIVING);

        //Then
        Assert.assertEquals("ss",result.getTaskName());
    }
}

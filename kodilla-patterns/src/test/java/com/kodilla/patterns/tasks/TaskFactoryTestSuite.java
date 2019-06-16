package com.kodilla.patterns.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        System.out.println(shoppingTask.executeTask());
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        System.out.println(paintingTask.executeTask());
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Painting", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        System.out.println(drivingTask.executeTask());
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Driving", drivingTask.getTaskName());
    }
}

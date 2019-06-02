package com.kodilla.spring70.Portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String testToDoList = "Task 1";
        String testInProgressList = "Task 1 in progress";
        String testDoneList = "Done Task 1";

        board.getToDoList().addTask(testToDoList);
        board.getInProgressList().addTask(testInProgressList);
        board.getDoneList().addTask(testDoneList);

        //Then
        Assert.assertEquals("Task 1", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Task 1 in progress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Done Task 1", board.getDoneList().getTasks().get(0));
    }

    @Test
    public void testTaskRead() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String testToDoList = "Task 1";
        String testInProgressList = "Task 1 in progress";
        String testDoneList = "Done Task 1";

        board.getToDoList().addTask(testToDoList);
        board.getInProgressList().addTask(testInProgressList);
        board.getDoneList().addTask(testDoneList);

        // Then
        board.readTask();
    }

}

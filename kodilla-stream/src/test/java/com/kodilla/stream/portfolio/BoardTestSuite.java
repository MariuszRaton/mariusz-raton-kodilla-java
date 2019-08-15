package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {

    PrepareTestData prepareTestData = new PrepareTestData();

    @Test
    public void testAddTaskList() {
        //Given
        Board project = prepareTestData.getPrepareTestData();
        //When

        //Then
        Assert.assertEquals(3, project.getTaskLists().size());
    }

    @Test
    public void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData.getPrepareTestData();
        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());
        //Then
        Assert.assertEquals(2, tasks.size());
        Assert.assertEquals(user, tasks.get(0).getAssignedUser());
        Assert.assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    public void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData.getPrepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        Assert.assertEquals(1, tasks.size());
        Assert.assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData.getPrepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(t -> t.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        //Then
        Assert.assertEquals(2, longTasks);
    }

    @Test
    public void testAddTaskListAverageWorkingOnTask() {
        //Given
        TaskListAverageWorkingOnTask taskListAverageWorkingOnTask = new TaskListAverageWorkingOnTask();

        //When
        double actualAverage = taskListAverageWorkingOnTask.getTaskListAverageWorkingOnTask();

        //Then
        Assert.assertEquals(10.0, actualAverage, 0);
    }
}

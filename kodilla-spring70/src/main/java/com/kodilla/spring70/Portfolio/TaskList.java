package com.kodilla.spring70.Portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public boolean addTask(String newTask) {
        return tasks.add(newTask);
    }


}

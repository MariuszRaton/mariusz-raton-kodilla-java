package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {

        if ((where != null) && (using != null)) {
            return "Task completed";
        }
        return "Task is not done";
    }

    @Override
    public boolean isTaskExecuted() {

        if (executeTask() == "Task completed") {
            return true;
        } else {
            return false;
        }
    }
}

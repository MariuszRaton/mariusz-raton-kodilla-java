package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    String labelOfExecute;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = "Driving";
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
            return labelOfExecute = "OK";
        }
        return labelOfExecute;
    }

    @Override
    public boolean isTaskExecuted() {

        if (labelOfExecute == "OK") {
            return true;
        } else {
            return false;
        }
    }
}

package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final  String color;
    final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {

        if ((color != null) && (whatToPaint != null)) {
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

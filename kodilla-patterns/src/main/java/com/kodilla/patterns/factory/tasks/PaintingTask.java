package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final  String color;
    final String whatToPaint;
    String labelOfExecute;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = "Painting";
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

package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {

        if (whatToBuy != null) {
            if (quantity > 0) {
                return "Task completed";
            }
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

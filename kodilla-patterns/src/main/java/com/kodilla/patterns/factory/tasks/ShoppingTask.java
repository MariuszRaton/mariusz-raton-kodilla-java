package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName ;
    final String whatToBuy;
    final double quantity;
    String labelOfExecute;

    public ShoppingTask(String taskName , String whatToBuy, double quantity) {
        this.taskName = "Shopping";
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
                return labelOfExecute = "OK";
            }
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

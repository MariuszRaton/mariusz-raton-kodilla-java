package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping",  "butter", 2);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "bedroom");
            case DRIVING:
                return new DrivingTask("Driving", "school", "bus");
            default:
                return null;
        }

    }


}

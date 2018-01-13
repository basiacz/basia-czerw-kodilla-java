package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public static Task createTask(String kindOfTask) {
        switch (kindOfTask) {
            case SHOPPING: return new ShoppingTask("xx", "xx", 2);
            case PAINTING: return new PaintingTask("yy", "yy","yy");
            case DRIVING: return new DrivingTask("ss", "ss", "ss");
            default: return null;
        }
    }
}
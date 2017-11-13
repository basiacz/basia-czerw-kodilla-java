package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle cricle = (Circle) o;
         return Double.compare(cricle.radius, radius) == 0;
    }
}
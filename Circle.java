package com.company;

public class Circle extends Figure {
    public static final double PI = 3.14;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double perimeter() {
        double perimeter = 2 * PI * this.radius;
        return perimeter;
    }

    public double area() {
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Figure "+getName()+" {perimeter "+perimeter()+", area "+area()+"}";
    }
}

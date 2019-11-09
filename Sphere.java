package com.company;

public class Sphere extends Figure {
    public static final double PI = 3.14;
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double perimeter() {
        double perimeter = Double.POSITIVE_INFINITY;;
        return perimeter;
    }

    public double area() {
        double area = 4*PI * Math.pow(this.radius, 2);
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

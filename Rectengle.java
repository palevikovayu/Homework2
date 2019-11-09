package com.company;

public class Rectengle extends Figure {
    private double side1;
    private double side2;

    public Rectengle(String name, double side1, double side2) {
        super(name);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double perimeter() {
        double perimeter = 2 * this.side1 * this.side2;
        return perimeter;
    }

    public double area() {
        double area = this.side1 * this.side2;
        return area;
    }
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public String toString() {
        return "Figure "+getName()+" {perimeter "+perimeter()+", area "+area()+"}";
    }
}
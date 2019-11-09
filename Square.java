package com.company;

public class Square extends Figure {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double perimeter() {
        double perimeter = this.side * 4;
        return perimeter;
    }

    public double area() {
        double area = Math.pow(this.side, 2);
        return area;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return "Figure "+getName()+" {perimeter "+perimeter()+", area "+area()+"}";
    }

}

package com.company;

public class Figure {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public double perimeter() {
        return 0;
    }

    public double area() {
        return 0;
    }

}

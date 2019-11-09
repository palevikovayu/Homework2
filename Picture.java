package com.company;

import java.util.*;

public class Picture {
    private List<Figure> list = new ArrayList<>();


    public void addFigure(Figure figure) {
        list.add(figure);
    }

    public void print() {
        System.out.println(list);
    }

    public void totalPerimeter() {
        double totalPerimeter = 0;
        for (int i = 0; i < list.size(); i++) {
            totalPerimeter += list.get(i).perimeter();
        }
        System.out.println("Total perimeter of all figures is " + totalPerimeter);
    }

    public void totalArea() {
        double totalArea = 0;
        for (int i = 0; i < list.size(); i++) {
            totalArea += list.get(i).area();
        }
        System.out.println("Total area of all figures is " + totalArea);
    }

    public void namesOfFigures() {
        List<String> namesOfFigures = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Figure figure = list.get(i);
            String nameOfFigure = figure.getName();
            namesOfFigures.add(nameOfFigure);
        }
        System.out.println(namesOfFigures);
    }

    public void numberOfFigures() {
        Map<String, Integer> map = new HashMap<>();
        int numberOfSquares = 0;
        int numberOfRectengles = 0;
        int numberOfCircles = 0;
        int numberOfSpheres = 0;
        for (int i = 0; i < list.size(); i++) {
            Figure figure = list.get(i);
            if (figure instanceof Square) {
                Square square = (Square) figure;
                numberOfSquares++;
            }
            if (figure instanceof Rectengle) {
                Rectengle rectengle = (Rectengle) figure;
                numberOfRectengles++;
            }
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                numberOfCircles++;
            }
            if (figure instanceof Sphere) {
                Sphere sphere = (Sphere) figure;
                numberOfSpheres++;
            }
        }
        map.put("Square", numberOfSquares);
        map.put("Rectengle", numberOfRectengles);
        map.put("Circle", numberOfCircles);
        map.put("Sphere", numberOfSpheres);
        System.out.println(map);
    }
}

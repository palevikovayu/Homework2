package com.company;

import java.util.*;

public class Main {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        Figure square = new Square("square", 4);
        System.out.println(square.toString());
        Figure rectangle = new Rectengle("rectangle", 4, 5);
        System.out.println(rectangle.toString());
        Figure circle = new Circle("circle", 3);
        System.out.println(circle.toString());
        Figure sphere = new Sphere("sphere", 6);
        System.out.println(sphere.toString());
        Figure square2 = new Square("square2", 3);
        Figure square3 = new Square("square3", 15);
        Figure circle2 = new Circle("circle2", 13);
        Figure circle3 = new Circle("circle3", 2);
        Figure circle4 = new Circle("circle4", 8);
        Picture picture = new Picture();
        picture.addFigure(square);
        picture.addFigure(square2);
        picture.addFigure(square3);
        picture.addFigure(rectangle);
        picture.addFigure(circle);
        picture.addFigure(circle2);
        picture.addFigure(circle3);
        picture.addFigure(circle4);
        picture.addFigure(sphere);
        picture.namesOfFigures();
        picture.totalPerimeter();
        picture.totalArea();
        picture.numberOfFigures();
        Mathematics math = new Mathematics();
        System.out.println(math.add(3, 5));
        System.out.println(math.add(205, 317));
        System.out.println(math.add(0.95f, 2.70f));
        System.out.println(math.add(5.10, 259.80));
        System.out.println(math.add("Юра","Катя"));
        int[] a = new int[]{2, 3, 8, 1};
        int[] b = new int[]{9, 5, 6, 3, 7};
        System.out.println(Arrays.toString(math.add(a, b)));
        List<String> list1 = new ArrayList<>(Arrays.asList("Вася", "Петя", "Катя"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Гена", "Коля", "Даша"));
        math.add(list1, list2);
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Вася");
        map1.put(4, "Петя");
        map1.put(7, "Катя");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Гена");
        map2.put(2, "Коля");
        map2.put(3, "Даша");
        math.add(map1, map2);
    }
}

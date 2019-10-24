package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println(Palindrome("шалаш"));
        System.out.println("Задача 2");
        int[] array = arrayOfAGivenSize(6);
        System.out.println(Arrays.toString(array));
        System.out.println("Задача 3");
        System.out.println(indexOfX(array, 3));
        System.out.println("Задача 4");
        int[] x = changeMinAndMax(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Задача 5");
        System.out.println(arithmeticAverageOfArray(array));
        System.out.println("Задача 6");
        System.out.println(numberOfNegativeElements(array));
        System.out.println("Задача 7");
        System.out.println(Arrays.toString(arrayWithoutElement(array, 3)));
        System.out.println("Задача 8");
        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println("Задача 9");
        System.out.println(sortedArray(array));
        System.out.println("Задача 10");
        System.out.println(Arrays.toString(shuffledArray(array)));
        System.out.println("Задача 11");
        System.out.println(Arrays.toString(growingArray(array)));
        System.out.println("Задача 12");
        twoDimensionalArray(2,3);

    }

    public static Boolean Palindrome(String string) {          //Задача 1 - является ли палиндромом
        String reversedString = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return string.equals(reversedString);
    }

    public static int[] arrayOfAGivenSize(int size) {        //Задача 2 - массив со случайными числами
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int indexOfX(int[] array, int x) {         //Задача 3 - позиция числа х
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] changeMinAndMax(int[] array) {            //Задача 4 - поменять местами min и max
        System.out.println(Arrays.toString(array));
        int minNumber = array[0];
        int minIndex = 0;
        int maxNumber = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (minNumber < array[i]) {
                minNumber = array[i];
                minIndex = i;
            }
            if (maxNumber > array[i]) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        array[minIndex] = maxNumber;
        array[maxIndex] = minNumber;
        return array;
    }

    public static double arithmeticAverageOfArray(int[] array) {     //Задача 5 - среднее арифметическое элементов массива
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int numberOfNegativeElements(int[] array) {         //Задача 6 - количество отрицательных элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] arrayWithoutElement(int[] array, int delete) {       //Задача 7 - удалить элемент массива
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != delete) {
                array2[j] = array[i];
                j++;
            }
        }
        return array2;
    }

    public static int[] reverseArray(int[] array) {          //Задача 8 - значения в обратном порядке
        System.out.println(Arrays.toString(array));
            for (int g = array.length - 1; g >= 0; g--) {
                System.out.print(array[g]+" ");
            }
        return array;
    }

    public static boolean sortedArray(int[] array) {        //Задача 9 - проверить сортировку оп возростанию
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] shuffledArray(int[] array) {        //Задача 10 - перетасовать в случайном порядке
        System.out.println(Arrays.toString(array));
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] growingArray(int[] array) {           //Задача 11 - сортировка по возростанию
        System.out.println(Arrays.toString(array));
        for (int n = 0; n < array.length; n++) {
            for (int g = 0; g < array.length - 1; g++) {
                if (array[g] > array[g + 1]) {
                    int tmp = array[g];
                    array[g] = array[g + 1];
                    array[g + 1] = tmp;
                }
            }
        }
        return array;
    }

    public static void twoDimensionalArray(int line, int column) {      //Задача 12 - двумерный массив со случайными числами
        int[][] array = new int[line][column];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 1;
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }

}

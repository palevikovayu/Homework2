package com.company;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        monthsOfAYear();
        System.out.println("Задача 2");
        daysInAMonth(MonthsOfAYear.FEBRUARY);
        System.out.println("Задача 3");
        System.out.println(difBetweenMaxAndMin(6));
        System.out.println("Задача 4");
        System.out.println(arrayComparison(6));
        System.out.println("Задача 5");
        missingNumberInArray();
        System.out.println("Задача 6");
        int[][] array = minElIn2DArray(4, 5);
        System.out.println("Задача 7");
        int[][] x = changeMinAndMaxElIn2DArray(array);
        System.out.println("Задача 8");
        int[][] y = arrayWithoutOddNumber(array);
        System.out.println("Задача 9");
        System.out.println(rezOfDiagonalEl(6));
    }

    public static void monthsOfAYear() {
        String name = MonthsOfAYear.FEBRUARY.name();
        System.out.println(name);
    }

    public static void daysInAMonth(MonthsOfAYear month) {        //Задача 2 - количество дней в месяце
        int numDays = 0;
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                numDays = 31;
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                numDays = 30;
                break;
            case FEBRUARY:
                numDays = 28;
                break;
            default:
                System.out.println("Несуществующий месяц");
                break;
        }
        System.out.println("В " + month + " " + numDays + " дней");

    }

    public static int difBetweenMaxAndMin(int size) {           //Задача 3 - разница между мах и min элементами массива
        int[] array = new int[size];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }
        int max = 0;
        int min = array[0];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        return max - min;
    }

    public static boolean arrayComparison(int size) {           //Задача 4 - одинаковы ли массивы
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(10);
            array2[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] == array2[j]) {
                return true;
            }
        }
        return false;
    }

    public static void missingNumberInArray() {           //Задача 5 - пропущенное число в массиве
        int[] array = {1, 0, 2, 3, 7, 5, 4, 8, 9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                j = array[i] + 1;
            }
        }
        System.out.println("Пропущено число " + j);
    }

    public static int[][] minElIn2DArray(int length, int width) {   //Задача 6 - минимальный элемент двумерного массива
        int[][] array = new int[length][width];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(10) + 5;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int k = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (k > array[i][j]) {
                    k = array[i][j];
                }
            }
        }
        System.out.printf("Минимальный элемент массива %d", k);
        System.out.println();
        return array;
    }

    public static int[][] changeMinAndMaxElIn2DArray(int[][] array) {   //Задача 7 - Поменять местами мин и макс элементы двумерного массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Измененный массив");
        int maxEl = array[0][0];
        int minEl = array[0][0];
        int maxIndexLength = 0;
        int maxIndexWidth = 0;
        int minIndexLength = 0;
        int minIndexWidth = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxEl < array[i][j]) {
                    maxEl = array[i][j];
                    maxIndexLength = i;
                    maxIndexWidth = j;
                }
                if (minEl > array[i][j]) {
                    minEl = array[i][j];
                    minIndexLength = i;
                    minIndexWidth = j;
                }
            }
        }
        array[maxIndexLength][maxIndexWidth] = minEl;
        array[minIndexLength][minIndexWidth] = maxEl;
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        return array;
    }

    public static int[][] arrayWithoutOddNumber(int[][] array) {      //Задача 8 - заменить все нечетные элементы массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    if (j == 0) {
                        array[i][j] = 0;
                    } else {
                        array[i][j] = array[i][j - 1];
                    }
                }
            }
        }
        System.out.println("Измененный массив");
        for (int k = 0; k < array.length; k++) {
            System.out.println(Arrays.toString(array[k]));
        }
        return array;
    }

    public static int rezOfDiagonalEl(int n) {            //Задача 9 - произведение диагональных элементов
        int[][] array = new int[4][5];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(9) + 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        int rez = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == n) {
                    if (i == 0) {
                        if (j == 0) {
                            rez = array[i + 1][j + 1];
                        }
                        if (j == array[i].length - 1) {
                            rez = array[i + 1][j - 1];
                        }
                        rez = array[i + 1][j - 1] * array[i + 1][j + 1];
                    }
                    if (j == 0) {
                        if (i == array.length - 1) {
                            rez = array[i - 1][j + 1];
                        }
                        rez = array[i - 1][j + 1] * array[i + 1][j + 1];
                    }
                    if (i == array.length - 1) {
                        if (j == array[i].length - 1) {
                            rez = array[i - 1][j - 1];
                        }
                        rez = array[i - 1][j - 1] * array[i - 1][j + 1];
                    }
                    if (j == array[i].length - 1) {
                        rez = array[i - 1][j - 1] * array[i + 1][j - 1];
                    }
                    rez = array[i - 1][j - 1] * array[i - 1][j + 1] * array[i + 1][j - 1] * array[i + 1][j + 1];
                }
            }
        }
        return rez;
    }
}




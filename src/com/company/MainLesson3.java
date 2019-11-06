package com.company;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Random;

<<<<<<< Updated upstream:src/com/company/MainLesson3.java
public class MainLesson3 {
=======
public class Main {
    public static final int LENGTH = 4;
    public static final int WIDTH = 5;
    public static final Random RANDOM = new Random();
>>>>>>> Stashed changes:Main.java

    public static void main(String[] args) {
        System.out.println("Задача 1");
        monthsOfAYear();
        System.out.println("Задача 2");
        System.out.println(daysInAMonth(MonthsOfAYear.FEBRUARY));
        System.out.println("Задача 3");
        int[] array = generateArray();
        System.out.println(difBetweenMaxAndMin(array));
        System.out.println("Задача 4");
        System.out.println(arrayComparison(6));
        System.out.println("Задача 5");
        int[] array2 = {1, 0, 2, 3, 7, 5, 4, 8, 9};
        missingNumberInArray(array2);
        System.out.println("Задача 6");
        int[][] array2D = create2DArray();
        int z = minElIn2DArray(array2D);
        System.out.println("Задача 7");
        int[][] x = changeMinAndMaxElIn2DArray(array2D);
        System.out.println("Задача 8");
        int[][] y = arrayWithoutOddNumber(array2D);
        System.out.println("Задача 9");
        System.out.println(rezOfDiagonalEl(create2DArray(), 6));
    }

    public static void monthsOfAYear() {                        //Задача 1
        String name = MonthsOfAYear.FEBRUARY.name();
        System.out.println(name);
    }

    public static int[] generateArray() {
        int[] array = new int[LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(10);
        }
        return array;
    }

    public static int[][] create2DArray() {
        int[][] array2D = new int[LENGTH][WIDTH];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = RANDOM.nextInt(10) + 5;
            }
        }
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        return array2D;
    }

    public static int[][] print2DArray(int[][] array2D) {
        for (int i = 0; i < array2D.length; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }
        return array2D;
    }

    public static int daysInAMonth(MonthsOfAYear month) {        //Задача 2 - количество дней в месяце
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
        return numDays;

    }

    public static int difBetweenMaxAndMin(int[] array) {           //Задача 3 - разница между мах и min элементами массива
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
        int[] array1 = new int[LENGTH];
        int[] array2 = new int[LENGTH];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = RANDOM.nextInt(10);
            array2[i] = RANDOM.nextInt(10);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int j = 0; j < array1.length; j++) {
            if (array1[j] != array2[j]) {
                return false;
            }
        }
        return true;
    }

    public static void missingNumberInArray(int[] array2) {           //Задача 5 - пропущенное число в массиве

        Arrays.sort(array2);
        int j = 0;
        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i + 1] != array2[i] + 1) {
                j = array2[i] + 1;
            }
        }
        System.out.println("Пропущено число " + j);
    }

    public static int minElIn2DArray(int[][] array2D) {   //Задача 6 - минимальный элемент двумерного массива
        int k = array2D[0][0];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (k > array2D[i][j]) {
                    k = array2D[i][j];
                }
            }
        }
        System.out.printf("Минимальный элемент массива %d", k);
        System.out.println();
        return k;
    }

    public static int[][] changeMinAndMaxElIn2DArray(int[][] array2D) {   //Задача 7 - Поменять местами мин и макс элементы двумерного массива
        int maxEl = array2D[0][0];
        int minEl = array2D[0][0];
        int maxIndexLength = 0;
        int maxIndexWidth = 0;
        int minIndexLength = 0;
        int minIndexWidth = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (maxEl < array2D[i][j]) {
                    maxEl = array2D[i][j];
                    maxIndexLength = i;
                    maxIndexWidth = j;
                }
                if (minEl > array2D[i][j]) {
                    minEl = array2D[i][j];
                    minIndexLength = i;
                    minIndexWidth = j;
                }
            }
        }
        array2D[maxIndexLength][maxIndexWidth] = minEl;
        array2D[minIndexLength][minIndexWidth] = maxEl;
        print2DArray(array2D);
        return array2D;
    }

    public static int[][] arrayWithoutOddNumber(int[][] array2D) {      //Задача 8 - заменить все нечетные элементы массива
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] % 2 != 0) {
                    if (j == 0) {
                        array2D[i][j] = 0;
                    } else {
                        array2D[i][j] = array2D[i][j - 1];
                    }
                }
            }
        }
        print2DArray(array2D);
        return array2D;
    }

    public static int rezOfDiagonalEl(int[][] array2D, int n) {            //Задача 9 - работает через раз. Не могу найти ошибку

        int rez = 0;
        for (int i = 0; i < array2D.length-1; i++) {
            for (int j = 0; j < array2D[i].length-1; j++) {
                if (array2D[i][j] == n) {
                    if (i == 0) {
                        if (j == 0) {
                            rez = array2D[i + 1][j + 1];
                        }
                        if (j == array2D[i].length - 1) {
                            rez = array2D[i + 1][j - 1];
                        }
                        rez = array2D[i + 1][j - 1] * array2D[i + 1][j + 1];
                    }
                    if (j == 0) {
                        if (i == array2D.length - 1) {
                            rez = array2D[i - 1][j + 1];
                        }
                        rez = array2D[i - 1][j + 1] * array2D[i + 1][j + 1];
                    }
                    if (i == array2D.length - 1) {
                        if (j == array2D[i].length - 1) {
                            rez = array2D[i - 1][j - 1];
                        }
                        rez = array2D[i - 1][j - 1] * array2D[i - 1][j + 1];
                    }
                    if (j == array2D[i].length - 1) {
                        rez = array2D[i - 1][j - 1] * array2D[i + 1][j - 1];
                    }
                    rez = array2D[i - 1][j - 1] * array2D[i - 1][j + 1] * array2D[i + 1][j - 1] * array2D[i + 1][j + 1];
                }
            }
        }
        System.out.printf("Произведение диагональных элементов равно %d %n", rez);
        return rez;
    }
}




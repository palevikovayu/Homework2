package com.company;

import java.util.List;
import java.util.Map;

public class Mathematics {
    public int add(int a, int b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int[] add(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }
        return result;
    }

    public void add(List<String> list1, List<String> list2) {
        for (String i : list2) {
            list1.add(i);
        }
        System.out.println(list1);
    }
    public void add(Map <Integer, String> map1, Map<Integer, String> map2) {
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
         map1.put(entry.getKey(), entry.getValue());
        }
        System.out.println(map1);
    }

}

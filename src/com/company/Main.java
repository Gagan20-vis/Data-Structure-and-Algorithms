package com.company;

import com.company.Algorithms.Sorting.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr= {45, 67, 78, 23};

        InsertionSort is = new InsertionSort();
        is.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
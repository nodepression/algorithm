package com.alg;

import com.alg.sort.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 3, 7, 0, 7, 9};
        new Sort().selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

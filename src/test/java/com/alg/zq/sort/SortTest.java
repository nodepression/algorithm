package com.alg.zq.sort;

import com.alg.zq.util.SortHelper;
import org.junit.jupiter.api.*;

import java.util.Arrays;


class SortTest {
    private static Sort sort;

    @BeforeAll
    static void setUp() {
        sort = new Sort();
    }

    @Test
    public void selectionSort() {
        int n = 100000;
        int[] arr = SortHelper.generateRandomArray(n, 0, n);
        SortHelper.testSort("selectionSort", arr);
    }
}
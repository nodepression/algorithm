package com.alg.sort;

import com.alg.util.SortHelper;
import org.junit.jupiter.api.*;


class SortTest {
    private static Sort sort;

    @BeforeAll
    static void setUp() {
        sort = new Sort();
    }

    @Test
    public void testSelectionSort() {
        int n = 10000;
        int[] arr = SortHelper.generateRandomArray(n, 0, n);
        SortHelper.testSort("selectionSort", arr);
    }

    @Test
    public void testBubbleSort() {
        int n = 10000;
        int[] arr = SortHelper.generateRandomArray(n, 0, n);
        SortHelper.testSort("bubbleSort", arr);
    }
}
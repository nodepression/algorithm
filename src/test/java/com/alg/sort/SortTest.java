package com.alg.sort;

import com.alg.util.SortHelper;
import org.junit.jupiter.api.*;


class SortTest {
    private static Sort sort;
    private static int N;

    @BeforeAll
    static void setUp() {
        sort = new Sort();
        N = 100000;
    }

    @Test
    public void testSelectionSort() {
        int[] arr = SortHelper.generateRandomArray(N, 0, N);
        SortHelper.testSort("selectionSort", arr);
    }

    @Test
    public void testBubbleSort() {
        int[] arr = SortHelper.generateRandomArray(N, 0, N);
        SortHelper.testSort("bubbleSort", arr);
    }

    @Test
    public void testQuickSort() {
        int[] arr = SortHelper.generateRandomArray(N, 0, N);
        SortHelper.testSort("quickSort", arr);
    }
}
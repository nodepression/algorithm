package com.alg.zq.sort;

public class Sort {
    /**
     * 选择排序 O(n^2)
     */
    public void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("请输入长度大于0的数组");
        } else {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                //[i,n)区间的最小值
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                //交换arr[i]和arr[minIndex]的值
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}

package com.alg.sort;

public class Sort {
    /**
     * 选择排序 O(n^2) 循环n次,每次循环在剩余集合中选择一个最大的值或者最小的值
     * 在每次迭代中只需要交换一次
     */
    public void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("请输入长度大于0的数组");
        } else {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                // [i,n)区间的最小值
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // 交换arr[i]和arr[minIndex]的值
                swapArrayItem(arr, i, minIndex);
            }
        }
    }

    /**
     * 冒泡排序 O(n^2) 循环n次，每次循环可以选择出最大的值或者最小的值，并将最值冒泡到最上面(数组尾部)
     * 在每次迭代中可能会交换多次
     */
    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("请输入长度大于0的数组");
        } else {
            int n = arr.length;
            // 遍历n-1次
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        swapArrayItem(arr, i, j);
                    }
                }
            }
        }
    }

    /**
     * 快速排序 O(nlogn) 平均情况下需要迭代 logn层,每层迭代共需要比较n次。
     * 每层迭代共需要比较n次,交换若干次
     */
    public void quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
    }

    public void quickSortHelper(int[] nums, final int start, final int end) {
        if (start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = nums[start];
        while (left < right) {
            while (nums[right] >= pivot && right > left) {
                right--;
            }
            while (nums[left] <= pivot && right > left) {
                left++;
            }
            if (left < right) {
                swapArrayItem(nums, left, right);
            }
        }
        swapArrayItem(nums, start, left);
        quickSortHelper(nums, start, left);
        quickSortHelper(nums, right + 1, end);
    }


    public void swapArrayItem(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

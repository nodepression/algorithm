package com.alg.zq.util;

import com.alg.zq.sort.Sort;

import java.lang.reflect.Method;
import java.util.Random;

public class SortHelper {
    /**
     * 生成n个[l,r]区间的整数
     *
     * @param n 生成数组的长度
     * @param l 最小的整数
     * @param r 最大的整数
     * @return 随机数组
     */
    public static int[] generateRandomArray(int n, int l, int r) {
        assert l <= r;
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE) % (r - l + 1) + l;
        }
        return arr;
    }

    /**
     * 验证算法是否有序
     *
     * @param arr 要验证的数组
     * @return 是否有序
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 测试排序算法
     *
     * @param sortMethodName 算法名称
     * @param arr            要测试的数组
     */
    public static void testSort(String sortMethodName, int[] arr) {
        try {
            //通过反射获取方法
            Sort sort = new Sort();
            Class<? extends Sort> sortClass = sort.getClass();
            Method sortMethod = sortClass.getMethod(sortMethodName, int[].class);

            //测试运行时长
            long startTime = System.currentTimeMillis();
            sortMethod.invoke(sort, arr);
            long endTime = System.currentTimeMillis();

            //验证是否有序
            assert isSorted(arr);

            System.out.println(sortClass.getSimpleName() + " : " + (endTime - startTime) + "ms");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

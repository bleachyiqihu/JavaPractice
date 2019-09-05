package com.bleachyiqihu.javapractice.datastructure.sort;

import java.util.Arrays;

/**
 * 快速排序是一种平均复杂度O(nlogn)的算法，是一种原地排序算法，但是不稳定
 * 在最坏情况下（有序），复杂度为O(n^2)
 *
 * @Author wuguan
 * @Date 2019/8/28 3:03
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {10, 5, 3, 7, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private void sort(int[] a, int p, int r) {
        if (p >= r) {
            return;
        }
        int mid = s(a, p, r);
        sort(a, p, mid - 1);
        sort(a, mid + 1, r);
    }

    private int s(int[] a, int p, int r) {
        int temp;
        int j = p, k = p;
        for (; j < r; j++) {
            if (a[j] < a[r]) {
                temp = a[j];
                a[j] = a[k];
                a[k] = temp;
                k++;
            }
        }
        temp = a[r];
        a[r] = a[k];
        a[k] = temp;
        return k;
    }


}

package com.bleachyiqihu.javapractice.datastructure.sort;

/**
 * @Author wuguan
 * @Date 2020/1/6 17:24
 **/
public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {1, 2, 9, 77, 5};
        mergeSort.sort(array);
        for (int e : array) {
            System.out.print(e);
            System.out.print("\t");
        }
    }

    private void sort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    private void merge(int[] array, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int n = end - start + 1;
        int[] tmp = new int[n];
        int p = 0;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j]) {
                tmp[p++] = array[i++];
            } else {
                tmp[p++] = array[j++];
            }
        }
        if (j <= end) {
            while (j <= end) {
                tmp[p++] = array[j++];
            }
        }
        if (i <= mid) {
            while (i <= mid) {
                tmp[p++] = array[i++];
            }
        }
        System.arraycopy(tmp, 0, array, start, n);
    }
}

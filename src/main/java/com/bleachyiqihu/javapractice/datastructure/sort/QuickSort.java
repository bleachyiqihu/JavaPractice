package com.bleachyiqihu.javapractice.datastructure.sort;

/**
 * @Author wuguan
 * @Date 2020/1/6 12:03
 **/
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {1, 5, 8, 4, 10, 9};
        quickSort.sort(array);
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
        int p = partition(array, start, end);
        sort(array, start, p - 1);
        sort(array, p + 1, end);
    }

    private int partition(int[] array, int start, int end) {
        int p = array[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (array[j] < p) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
            }
        }
        array[end] = array[i];
        array[i] = p;
        return i;
    }

}

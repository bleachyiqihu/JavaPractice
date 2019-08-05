package com.bleachyiqihu.javapractice.datastructure.sort;

/**
 * @Author wuguan
 * @Date 2019/8/5 18:50
 **/
public class InsertSort {

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] a = {1, 6, 9, 7, 10};
        insertSort.insertSort(a, a.length);
        for (int i : a) {
            System.out.print(i + "\t");
        }
    }

    private void insertSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = value;
        }
    }
}

package com.bleachyiqihu.javapractice.datastructure.sort;

/**
 * @Author wuguan
 * @Date 2019/7/23 11:11
 **/
public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] a = {1, 3, 4, 5, 7, 2};
        System.out.println(mergeSort.count(a, a.length));
        for(int num: a) {
            System.out.print(num + "\t");
        }
    }

    private int num = 0;

    private int count(int[] a, int n) {
        num = 0;
        mergeSortCount(a, 0, n - 1);
        return num;
    }

    private void mergeSortCount(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSortCount(a, p, q);
            mergeSortCount(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    private void merge(int[] a, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int[] temp = new int[r - p + 1];
        int t = 0;
        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                temp[t++] = a[i++];
            } else {
                num += q - i + 1;
                temp[t++] = a[j++];
            }
        }
        while (i <= q) {
            temp[t++] = a[i++];
        }
        while (j <= r) {
            temp[t++] = a[j++];
        }
        for (i = 0; i < r - p + 1; i++) {
            a[p + i] = temp[i];
        }
    }

}

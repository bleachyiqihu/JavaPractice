package com.bleachyiqihu.javapractice.datastructure.sort;

/**
 * Created by Paul on 2018-11-26
 */
public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = {5, 4, 6, 9, 9};
        bubbleSort.sort(a, a.length);
        for (int n : a) {
            System.out.print(n + "\t");
        }
    }

    private void sort(int[] a, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }


}

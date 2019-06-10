package com.bleachyiqihu.javapractice.datastructure.heap;

/**
 * @Author wuguan
 * @Date 2019/6/9 20:24
 **/
class HeapSort {

    private int swapCount = 0;

    void sort(int[] a) {
        buildHeap(a, a.length - 1);
        sort(a, a.length - 1);
    }

    private void buildHeap(int[] a, int n) {
        if (a == null) {
            return;
        }
        for (int i = n / 2; i >= 1; i--) {
            heapify(a, i, n);
        }
    }

    private void sort(int[] a, int n) {
        int count = n;
        while (count > 1) {
            heapify(a, 1, count);
            swap(a, 1, count);
            count--;
        }

    }

    void heapify(int[] a, int i, int n) {
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && a[i * 2] > a[i]) {
                maxPos = i * 2;
            }
            if (i * 2 + 1 <= n && a[i * 2 + 1] > a[maxPos]) {
                maxPos = i * 2 + 1;
            }
            if (maxPos == i) {
                break;
            }
            swap(a, i, maxPos);
            i = maxPos;
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        swapCount++;
    }

    int getSwapCount() {
        return swapCount;
    }
}

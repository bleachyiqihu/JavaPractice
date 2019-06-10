package com.bleachyiqihu.javapractice.datastructure.heap;

/**
 * @Author wuguan
 * @Date 2019/6/6 16:24
 **/
class Heap {
    private int[] a;
    private int count;
    private int n;

    Heap(int capacity) {
        this.n = capacity;
        this.count = 0;
        a = new int[capacity + 1];
    }

    void insert(int data) {
        if (count >= n) {
            return;
        }
        a[++count] = data;
        int pos = count;
        while (pos / 2 > 0 && a[pos / 2] < a[pos]) {
            swap(a, pos / 2, pos);
            pos = pos / 2;
        }
    }

    void removeMax() {
        if (count < 1) {
            return;
        }
        swap(a, 1, count);
        count--;
        new HeapSort().heapify(a, 1, count);
    }

    void printHeap() {
        for (int i = 1; i <= this.count; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    private void swap(int[] a, int pos1, int pos2) {
        int temp;
        temp = a[pos1];
        a[pos1] = a[pos2];
        a[pos2] = temp;
    }
}

package com.bleachyiqihu.javapractice.datastructure.heap;

/**
 * @Author wuguan
 * @Date 2019/6/9 10:46
 **/
public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(5);
        heap.printHeap();
        heap.insert(5);
        heap.insert(9);
        heap.insert(10);
        heap.insert(11);
        heap.printHeap();
        heap.removeMax();
        heap.printHeap();

        int[] a = {0, 2, 3, 4, 7};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(a);
        for(int e: a) {
            System.out.print(e + "\t");
        }
        System.out.println();
        System.out.print(heapSort.getSwapCount());
    }
}

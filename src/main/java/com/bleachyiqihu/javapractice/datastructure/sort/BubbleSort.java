package com.bleachyiqihu.javapractice.datastructure.sort;


/**
 * Created by Paul on 2017-10-11
 */
public class BubbleSort {
    private static int[] bubbleSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {100, 5, 3, 6, 8};
        unsortedArray = bubbleSort(unsortedArray);
        for (int e : unsortedArray) {
            System.out.println(e);
        }
    }
}

package com.bleachyiqihu.javapractice.computersystem;

public class Main {
    public static void main(String[] args) {
        BitMap bitMap = new BitMap();
        bitMap.set(1);
        System.out.println(bitMap.test(1));
        bitMap.clear(1);
        System.out.println(bitMap.test(1));
    }
}

package com.bleachyiqihu.javapractice.computersystem;

class BitMap {
    private static final int SHIT = 5;
    private static final int N = 10000000;
    private static final int INT_BITS = 32;
    private static final int MASK = 0x1F;

    private int[] bit = new int[1 + N / INT_BITS];

    BitMap() {
        for (int i = 0; i < N / INT_BITS; i++) {
            bit[i] = 0;
        }
    }

    void set(int i) {
        bit[i >> SHIT] |= (1 << (i & MASK));
    }

    void clear(int i) {
        bit[i >> SHIT] &= ~(1 << (i & MASK));
    }

    int test(int i) {
        return bit[i >> SHIT] & (1 << (i & MASK));
    }
}

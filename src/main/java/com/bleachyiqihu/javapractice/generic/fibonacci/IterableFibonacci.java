package com.bleachyiqihu.javapractice.generic.fibonacci;

import java.util.Iterator;

/**
 * Created by Paul on 2017/10/21
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int count;

    public IterableFibonacci(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return count > 0;
            }

            @Override
            public Integer next() {
                count--;
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        IterableFibonacci iterableFibonacci = new IterableFibonacci(18);
        for(Integer i : iterableFibonacci) {
            System.out.println(i);
        }
    }
}

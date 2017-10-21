package com.bleachyiqihu.javapractice.generic.fibonacci;

/**
 * 斐波那契数列的生成器
 * <p>
 * Created by Paul on 2017/10/21
 */
public class Fibonacci implements Generator<Integer> {
    private int index = 1;

    private int fib(int index) {
        if (index > 2)
            return fib(index - 1) + fib(index - 2);
        return 1;
    }

    @Override
    public Integer next() {
        return fib(index++);
    }

    public static void main(String[] args) {
        Generator<Integer> gen = new Fibonacci();
        for(int i = 1; i <= 18; i++) {
            System.out.println(gen.next());
        }
    }
}

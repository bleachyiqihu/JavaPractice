package com.bleachyiqihu.javapractice.generic;

/**
 * ----------------------------------------------------------------
 * 信使类，Java函数需要返回多个对象时，常常使用信使的方式持有对象
 * 但是这种持有不应该被类型限制，是泛型的一个使用场景
 * ----------------------------------------------------------------
 * Created by Paul on 2017/10/21
 */
public class Messenger<T, U, K> {
    // 对于信使来说，使用方只能获取持有对象并随意使用，却无法修改
    // 信使本身的意义是传递数据
    public final T first;
    public final U second;
    public final K third;

    public Messenger(T first, U second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ", " + third + ")";
    }

    static Messenger<String, String, String> getMessage() {
        return new Messenger<>("HI", "nice to meet u", "and u?");
    }

    public static void main(String[] args) {
        Messenger<String, String, String> info = getMessage();
        System.out.println(info.first);
        System.out.println(info.second);
        System.out.println(info.third);
        System.out.println(info);
    }
}

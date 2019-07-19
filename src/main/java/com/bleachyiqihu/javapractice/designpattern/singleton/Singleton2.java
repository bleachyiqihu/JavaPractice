package com.bleachyiqihu.javapractice.designpattern.singleton;

/**
 * @Author wuguan
 * @Date 2019/7/8 11:59
 **/
public class Singleton2 {

    private Singleton2() {
    }

    private static class SingletonHolder {

        static {
            System.out.println("LazyHolder.<clinit>");
        }

        private static final Singleton2 INSTANCE = new Singleton2();
    }

    public static Object get(boolean flag) {
        if (flag) return new SingletonHolder[2];
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        get(true);
        System.out.println("------");
        get(false);
    }
}

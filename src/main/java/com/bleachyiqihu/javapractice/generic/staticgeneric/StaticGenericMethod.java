package com.bleachyiqihu.javapractice.generic.staticgeneric;

/**
 * @Author wuguan
 * @Date 2019/6/30 17:20
 **/
public class StaticGenericMethod {

    private <T> GenericClz<T> getObject() {
        return new GenericClz<>();
    }

    public static void main(String[] args) {
        StaticGenericMethod staticGenericMethod = new StaticGenericMethod();

        GenericClz<String> genericClz = staticGenericMethod.getObject();

        genericClz.print("abc");
    }

}

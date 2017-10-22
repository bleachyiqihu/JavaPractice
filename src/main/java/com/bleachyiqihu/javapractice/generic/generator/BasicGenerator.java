package com.bleachyiqihu.javapractice.generic.generator;

import com.bleachyiqihu.javapractice.generic.Generator;

/**
 * 一个泛型生成器，对于任意一种类型，都可以通过next方法返回一个该类型的默认对象
 * 自身可以通过create静态方法得到
 * <p>
 * Created by Paul on 2017/10/21
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> BasicGenerator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }
}

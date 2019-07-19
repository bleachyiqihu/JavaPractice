package com.bleachyiqihu.javapractice.generic.self;

/**
 * @Author wuguan
 * @Date 2019/7/14 11:19
 **/
abstract class Test<T extends Test<T>> {

    abstract String getAttr();

    T getSelf() {
        return self();
    }

    protected abstract T self();
}

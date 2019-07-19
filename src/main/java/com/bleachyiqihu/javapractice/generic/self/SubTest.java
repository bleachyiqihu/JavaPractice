package com.bleachyiqihu.javapractice.generic.self;

/**
 * @Author wuguan
 * @Date 2019/7/14 11:21
 **/
 class SubTest extends Test<SubTest> {
    @Override
    protected SubTest self() {
        return this;
    }

    @Override
    String getAttr() {
        return null;
    }
}

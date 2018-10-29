package com.bleachyiqihu.javapractice.lambda;

/**
 * 实现谓词接口的苹果类
 * Created by Administrator on 2017/3/29.
 */
class Apple {

    private String color;

    Apple(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor();
    }
}

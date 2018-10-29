package com.bleachyiqihu.javapractice.designpattern.decorator;

/**
 * Created by Paul on 2017-09-09
 */
public abstract class Beverage {
    protected String desc = "Unknown Beverage";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();
}

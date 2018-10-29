package com.bleachyiqihu.javapractice.designpattern.decorator.beverageimpl;


import com.bleachyiqihu.javapractice.designpattern.decorator.Beverage;

/**
 * Created by Paul on 2017-09-09
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.desc = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

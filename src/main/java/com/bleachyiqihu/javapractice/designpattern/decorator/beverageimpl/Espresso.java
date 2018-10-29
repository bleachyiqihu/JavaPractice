package com.bleachyiqihu.javapractice.designpattern.decorator.beverageimpl;


import com.bleachyiqihu.javapractice.designpattern.decorator.Beverage;

/**
 * Created by Paul on 2017-09-09
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.desc = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

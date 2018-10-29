package com.bleachyiqihu.javapractice.designpattern.decorator.condimentimpl;


import com.bleachyiqihu.javapractice.designpattern.decorator.Beverage;
import com.bleachyiqihu.javapractice.designpattern.decorator.Condiment;

/**
 * Created by Paul on 2017-09-09
 */
public class Mocha extends Condiment {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}

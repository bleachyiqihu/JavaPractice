package com.bleachyiqihu.javapractice.designpattern.decorator;


import com.bleachyiqihu.javapractice.designpattern.decorator.beverageimpl.Espresso;
import com.bleachyiqihu.javapractice.designpattern.decorator.beverageimpl.HouseBlend;
import com.bleachyiqihu.javapractice.designpattern.decorator.condimentimpl.Mocha;

/**
 * Created by Paul on 2017-09-09
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDesc() + " $" + beverage2.cost());
    }
}

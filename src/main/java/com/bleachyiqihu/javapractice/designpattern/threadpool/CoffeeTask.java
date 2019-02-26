package com.bleachyiqihu.javapractice.designpattern.threadpool;

class CoffeeTask extends Task {

    private static final int COFFEE_WORK_UNIT = 200;

    public CoffeeTask(int coffeeNum) {
        super(coffeeNum * COFFEE_WORK_UNIT);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + super.toString();
    }
}

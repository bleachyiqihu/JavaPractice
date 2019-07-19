package com.bleachyiqihu.javapractice.designpattern.threadpool;

public class CodingTask extends Task {
    private static final int CODING_WORK_UNIT = 500;

     CodingTask(int codeNum) {
        super(codeNum * CODING_WORK_UNIT);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + super.toString();
    }
}

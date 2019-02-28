package com.bleachyiqihu.javapractice.dynamicproxy.jdkproxy;

/**
 * @Author wuguan
 * @Date 2019/2/25 21:18
 **/
public class MyServiceImpl implements MyService {
    @Override
    public void service() {
        System.out.println("Doing service.");
    }
}

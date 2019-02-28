package com.bleachyiqihu.javapractice.dynamicproxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @Author wuguan
 * @Date 2019/2/25 21:21
 **/
public class Main {
    public static void main(String[] args) {
        MyService proxy = (MyService) Proxy.newProxyInstance(
                MyService.class.getClassLoader(),
                new Class[]{MyService.class},
                new MyHandler(new MyServiceImpl()));
        proxy.service();
    }
}

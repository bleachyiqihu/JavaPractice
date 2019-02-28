package com.bleachyiqihu.javapractice.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author wuguan
 * @Date 2019/2/25 21:19
 **/
public class MyHandler implements InvocationHandler {

    private MyService target;

    public MyHandler(MyService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("=======before invoke");
        Object result = method.invoke(target, args);
        System.out.println("=======after invoke");
        return result;
    }
}

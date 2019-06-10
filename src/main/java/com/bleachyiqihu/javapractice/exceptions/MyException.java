package com.bleachyiqihu.javapractice.exceptions;

/**
 * @Author wuguan
 * @Date 2019/6/5 16:50
 **/
public class MyException extends Exception {
    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}

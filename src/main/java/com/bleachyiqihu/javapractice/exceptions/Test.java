package com.bleachyiqihu.javapractice.exceptions;

/**
 * @Author wuguan
 * @Date 2019/6/5 16:50
 **/
public class Test {
    public static void main(String[] args) {
        try {
            try {
                String a = null;
                System.out.println(a.length());
            } catch (Throwable e) {
                throw new MyException("a", e);
            }
        } catch (MyException e) {
            e.printStackTrace();
        }



    }
}

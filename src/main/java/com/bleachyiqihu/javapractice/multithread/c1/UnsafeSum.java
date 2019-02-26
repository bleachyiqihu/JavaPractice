package com.bleachyiqihu.javapractice.multithread.c1;


import com.bleachyiqihu.javapractice.multithread.annotation.NotThreadSafe;

@NotThreadSafe
public class UnsafeSum {
    private int id;
    int getId() {return id++;}
}

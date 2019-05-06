package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:37
 **/
public class Main {
    public static void main(String[] args) {
        King king = new King();
        Request requestA = new Request(RequestType.A, "HI");
        Request requestB = new Request(RequestType.B, "HELLO");
        king.makeReq(requestA);
        king.makeReq(requestB);
    }
}

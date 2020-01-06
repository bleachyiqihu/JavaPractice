package com.bleachyiqihu.javapractice.netty.oldsocket;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @Author wuguan
 * @Date 2019/12/27 13:44
 **/
public class SocketServerCase {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        ss.accept();
    }

}

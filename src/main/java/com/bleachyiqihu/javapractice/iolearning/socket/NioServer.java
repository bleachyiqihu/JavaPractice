package com.bleachyiqihu.javapractice.iolearning.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;

/**
 * Created by Paul on 2019-03-17
 */
public class NioServer extends Thread {

    public static void main(String[] args) {
        NioServer nioServer = new NioServer();
        nioServer.start();
    }

    @Override
    public void run() {
        try (SocketChannel socketChannel = SocketChannel.open(); Selector selector = Selector.open()) {
            socketChannel.bind(new InetSocketAddress("127.0.0.1", 65000));
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_ACCEPT);
            while (true) {
                selector.select();
                Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
                while (iter.hasNext()) {
                    SelectionKey key = iter.next();
                    sayHelloWorld((ServerSocketChannel) key.channel());
                    iter.remove();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sayHelloWorld(ServerSocketChannel socketChannel) {
        try (SocketChannel socket = socketChannel.accept()) {
            socket.write(Charset.defaultCharset().encode("Hello world!"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

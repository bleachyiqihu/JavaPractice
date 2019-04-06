package com.bleachyiqihu.javapractice.iolearning.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Paul on 2019-03-17
 */
public class Main {
    public static void main(String[] args) {
//        DemoServer server = new DemoServer();
//        server.start();
//        try (Socket socket = new Socket(InetAddress.getLocalHost(), server.getPort())) {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            bufferedReader.lines().forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(Socket socket = new Socket("127.0.0.1", 65000)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.bleachyiqihu.javapractice.iolearning.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Paul on 2019-03-17
 */
class RequestHandler extends Thread {
    private Socket socket;

    RequestHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (PrintWriter printWriter = new PrintWriter(socket.getOutputStream())) {
            printWriter.println("Hello world!");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

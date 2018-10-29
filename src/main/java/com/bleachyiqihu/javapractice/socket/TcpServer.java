package com.bleachyiqihu.javapractice.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * Created by Paul on 2017-12-02
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        System.out.print("Tcp server ready.");
        Socket socket = serverSocket.accept();
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))
        ) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8))) {
                String cmd = bufferedReader.readLine();
                if ("time".equals(cmd)) {
                    bufferedWriter.write(LocalDateTime.now().toString() + "\n");
                    bufferedWriter.flush();
                } else {
                    bufferedWriter.write("Sorry?\n");
                    bufferedWriter.flush();
                }
            }
        }
        socket.close();
        serverSocket.close();
    }
}

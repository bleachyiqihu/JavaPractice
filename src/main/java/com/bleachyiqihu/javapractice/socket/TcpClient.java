package com.bleachyiqihu.javapractice.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * Created by Paul on 2017-12-02
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getLocalHost();
        try (Socket socket = new Socket(address, 9000)) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8))) {
                    bufferedWriter.write("time\n");
                    bufferedWriter.flush();
                    String resp = bufferedReader.readLine();
                    System.out.println(resp);
                }
            }
        }
    }
}

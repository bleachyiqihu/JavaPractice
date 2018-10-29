package com.bleachyiqihu.javapractice.designpattern.decorator.input;

import java.io.*;

/**
 * Created by Paul on 2017-09-09
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
            while ((c = in.read()) > 0) {
                System.out.println((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

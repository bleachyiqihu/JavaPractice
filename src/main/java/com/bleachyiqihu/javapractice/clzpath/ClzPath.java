package com.bleachyiqihu.javapractice.clzpath;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 */
class ClzPath {
    void getProperties() throws IOException {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("mytest.properties");
        InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        char[] c = new char[100];
        int r = reader.read(c);
        System.out.println(c);
        System.out.println(r);
        reader.close();
    }}

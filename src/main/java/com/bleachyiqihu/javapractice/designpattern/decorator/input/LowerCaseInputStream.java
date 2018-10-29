package com.bleachyiqihu.javapractice.designpattern.decorator.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Paul on 2017-09-09
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] bytes, int offset, int len) throws IOException {
        int result = super.read(bytes, offset, len);
        for(int i=offset; i < offset + result; i++) {
            bytes[i] = (byte)Character.toLowerCase((char) bytes[i]);
        }
        return result;
    }
}

package com.bleachyiqihu.javapractice.common;


import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author wuguan
 * @Date 2019/9/17 18:46
 **/
public class MD5Utils {
    public final static String DIGEST_TYPE = "MD5";
    public final static String DEFAULT_ENCODING = "UTF-8";

    /**
     * 工具类，不需要构造
     */
    private MD5Utils() {
    }

    /**
     * MD5签名
     *
     * @param value
     *
     * @return
     */
    public static String signitureWithMD5(String value) {
        return signitureWithMD5("" , value);
    }

    /**
     * MD5签名
     *
     * @param key
     * @param value
     *
     * @return
     */
    public static String signitureWithMD5(String key, String value) {
        return DigestUtils.md5Hex(key + value);
    }

    public static String signitureWithMD5(InputStream is) throws IOException {
        return DigestUtils.md5Hex(is);
    }

    public static String signitureWithMD5(byte[] bytes) throws IOException {
        return DigestUtils.md5Hex(bytes);
    }
}

package com.bleachyiqihu.javapractice.thinkinginjava.multiplex.override;

/**
 *
 * Created by Paul on 2017/6/19.
 */
class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }

    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

public class Hide extends Homer{
    @Override
    char doh(char m) {
        System.out.println("doh(Milhouse)");
        return 'a';
    }
}

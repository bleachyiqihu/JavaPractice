package com.bleachyiqihu.javapractice.jvm.gc.referencecounting;

/**
 * Created by Paul on 2019-03-02
 */
class ReferenceCountingGC {

    private Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[_1MB];

    void test() {
        ReferenceCountingGC ins1 = new ReferenceCountingGC();
        ReferenceCountingGC ins2 = new ReferenceCountingGC();
        ins1.instance = ins2;
        ins2.instance = ins1;

        System.gc();
    }
}

package com.bleachyiqihu.javapractice.datastructure.hash.hashfunc;

/**
 * Created by Paul on 2018-10-27
 */
class StringHashingFunc {
    int hashing(String s, int tableSize) {
        int hashVal = 0;
        for (int i = 0; i < s.length(); i++) {
            hashVal = s.charAt(i) + hashVal * 37;
        }
        hashVal %= tableSize;
        if (hashVal < 0) {
            hashVal += tableSize;
        }
        return hashVal;
    }
}

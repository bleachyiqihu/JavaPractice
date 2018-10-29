package com.bleachyiqihu.javapractice.datastructure.hash.seperatechaininghashtable;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Paul on 2018-10-27
 */
class SeparateChainingHashTable<T> {

    private static final int DEFAULT_LIST_SIZE = 100;

    private List<T>[] theLists;
    private int currentSize;

    @SuppressWarnings("unchecked")
    private SeparateChainingHashTable(int tableSize) {
        theLists = new LinkedList[nextPrime(tableSize)];
        for (int i = 0; i < theLists.length; i++) {
            theLists[i] = new LinkedList<>();
        }
    }

    SeparateChainingHashTable() {
        this(DEFAULT_LIST_SIZE);
    }

    void makeEmpty() {
        for (List<T> list : theLists)
            list.clear();
        currentSize = 0;
    }

    /**
     * Insert into the hash table. If the item is already present, then do nothing
     *
     * @param x the item to insert
     */
    void insert(T x) {
        List<T> whichList = theLists[myHash(x)];
        if (!whichList.contains(x)) {
            whichList.add(x);
            if (++currentSize > theLists.length)
                rehash();
        }
    }

    boolean contains(T x) {
        List<T> whichList = theLists[myHash(x)];
        return whichList.contains(x);
    }

    void remove(T x) {
        List<T> whichList = theLists[myHash(x)];
        if (whichList.contains(x)) {
            whichList.remove(x);
            currentSize--;
        }
    }

    private int myHash(T x) {
        int hashVal = x.hashCode();
        hashVal %= theLists.length;
        if (hashVal < 0)
            hashVal += theLists.length;
        return hashVal;
    }

    private void rehash() {
    }

    private static int nextPrime(int n) {
        if (n % 2 == 0)
            n++;
        while (!isPrime(n))
            n += 2;
        return n;
    }

    private static boolean isPrime(int n) {
        if(n == 3 || n == 2)
            return true;

        if(n == 1 || n % 2 == 0)
            return false;

        for(int i=3;i*i <= n;i+=2)
            if(n % i == 0)
                return false;

        return true;
    }

}

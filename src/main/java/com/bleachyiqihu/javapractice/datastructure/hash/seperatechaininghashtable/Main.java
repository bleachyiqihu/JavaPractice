package com.bleachyiqihu.javapractice.datastructure.hash.seperatechaininghashtable;

/**
 * Created by Paul on 2018-10-27
 */
public class Main {
    public static void main(String[] args) {
        SeparateChainingHashTable<Emploee> hashTable = new SeparateChainingHashTable<>();
        Emploee emploee1 = new Emploee();
        emploee1.setName("zhang_cheng");
        hashTable.insert(emploee1);
    }
}

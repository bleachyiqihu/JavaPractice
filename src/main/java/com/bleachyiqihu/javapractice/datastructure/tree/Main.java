package com.bleachyiqihu.javapractice.datastructure.tree;

/**
 * Created by Paul on 2018-12-26
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        bst.remove(5);
        bst.printTree();
        System.out.println(bst.findMax());
        System.out.println(bst.findMin());
        bst.makeEmpty();
    }
}

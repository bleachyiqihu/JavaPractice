package com.bleachyiqihu.javapractice.datastructure.tree;

/**
 * Created by Paul on 2017-11-16
 */
public class BinarySearchTreeClient {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(6);
        binarySearchTree.insert(2);
        binarySearchTree.insert(8);
        binarySearchTree.insert(1);
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        binarySearchTree.printTree();
        System.out.println("******************************");
        binarySearchTree.remove(4);
        binarySearchTree.printTree();
        System.out.println("********************insert 4********************");
        binarySearchTree.insert(4);
        binarySearchTree.printTree();
        System.out.println("********************remove 2********************");
        binarySearchTree.remove(2);
        binarySearchTree.printTree();
    }
}

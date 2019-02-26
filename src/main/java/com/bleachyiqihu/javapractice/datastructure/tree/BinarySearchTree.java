package com.bleachyiqihu.javapractice.datastructure.tree;

/**
 * Created by Paul on 2018-12-25
 */
 class BinarySearchTree<T extends Comparable<? super T>> {
    private class Node {
        private T element;
        private Node left;
        private Node right;

        Node(T element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    void makeEmpty() {
        root = null;
    }

    void insert(T x) {
        root = insert(x, root);
    }

    void remove(T x) {
        root = remove(x, root);
    }

    T findMax() {
        return findMax(root);
    }

    T findMin() {
        return findMin(root);
    }


    void printTree() {
        printTree(root);
    }


    private void printTree(Node t) {
        if (t != null) {
            System.out.println(t.element.toString());
            printTree(t.left);
            printTree(t.right);
        }

    }


    private T findMin(Node t) {
        if (t == null)
            return null;
        while (t.left != null) {
            t = t.left;
        }
        return t.element;
    }


    private T findMax(Node t) {
        if (t == null) {
            return null;
        }
        if (t.right == null) {
            return t.element;
        } else {
            return findMax(t.right);
        }
    }


    private Node remove(T x, Node t) {
        if (t == null) {
            return null;
        }
        int cmpRes = t.element.compareTo(x);
        if (cmpRes > 0) {
            t.left = remove(x, t.left);
        } else if (cmpRes < 0) {
            t.right = remove(x, t.right);
        } else {
            if (t.left != null && t.right != null) {
                t.element = findMax(t.left);
                t.left = remove(t.element, t.left);
            } else {
                t = t.right != null ? t.right : t.left;
            }
        }
        return t;
    }


    private Node insert(T x, Node t) {
        if (t == null)
            return new Node(x);
        int cmpRes = t.element.compareTo(x);
        if (cmpRes > 0) {
            t.left = insert(x, t.left);
        } else if (cmpRes < 0) {
            t.right = insert(x, t.right);
        }
        return t;
    }
}

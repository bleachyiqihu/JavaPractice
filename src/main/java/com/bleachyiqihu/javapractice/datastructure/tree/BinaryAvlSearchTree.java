package com.bleachyiqihu.javapractice.datastructure.tree;

/**
 * Created by Paul on 2018-12-26
 */
public class BinaryAvlSearchTree<T extends Comparable<? super T>> {

    private static final int ALLOWED_IMBALANCE = 2;

    private class AvlNode {
        private T element;
        private AvlNode left;
        private AvlNode right;
        private int height;

        private AvlNode(T element) {
            this.element = element;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }


    private AvlNode balance(AvlNode t) {
        if (t == null)
            return null;
        if (height(t.right) - height(t.left) > ALLOWED_IMBALANCE) {
            if (height(t.right.left) > height(t.right.right)) {
                return doubleWithRightChild(t);
            } else {
                return rotateWithRightChild(t);
            }
        } else if (height(t.left) - height(t.right) > ALLOWED_IMBALANCE) {
            if (height(t.left.left) >= height(t.left.right)) {
                return rotateWithLeftChild(t);
            } else {
                return doubleWithLeftChild(t);
            }
        }
        t.height = Math.max(height(t.left), height(t.right)) + 1;
        return t;
    }


    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }

    private AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k2), height(k1.left)) + 1;
        return k1;
    }

    private AvlNode rotateWithRightChild(AvlNode k2) {
        AvlNode k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k2), height(k1.right)) + 1;
        return k1;
    }

    private AvlNode doubleWithLeftChild(AvlNode k2) {
        k2.left = rotateWithRightChild(k2.left);
        return rotateWithLeftChild(k2);
    }

    private AvlNode doubleWithRightChild(AvlNode k2) {
        k2.right = rotateWithLeftChild(k2.right);
        return rotateWithRightChild(k2);
    }
}

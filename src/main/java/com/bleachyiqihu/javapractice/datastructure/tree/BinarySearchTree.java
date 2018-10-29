package com.bleachyiqihu.javapractice.datastructure.tree;

/**
 * Created by Paul on 2017-11-16
 */
public class BinarySearchTree<T extends Comparable<? super T>> {
    private static class Node<T> {
        T element;
        Node<T> leftChild;
        Node<T> rightChild;

        Node(T element, Node<T> leftChild, Node<T> rightChild) {
            this.element = element;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        Node(T element) {
            this(element, null, null);
        }
    }

    private Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean contains(T element) {
        return contains(element, root);
    }

    public T findMax() {
        if(isEmpty()) {
            throw new RuntimeException();
        }
        return findMax(root).element;
    }

    public T findMin() {
        if(isEmpty()) {
            throw new RuntimeException();
        }
        return findMin(root).element;
    }

    public void insert(T element) {
        root = insert(element, root);
    }

    public void remove(T element) {
        root = remove(element, root);
    }

    public void printTree() {
        if(isEmpty()) {
            System.out.println("Binary tree is empty.");
        }
        printTree(root);
    }

    private boolean contains(T element, Node<T> root) {
        if(root == null)
            return false;
        int cmpResult = element.compareTo(root.element);
        if(cmpResult > 0) {
            return contains(element, root.rightChild);
        } else if(cmpResult < 0) {
            return contains(element, root.leftChild);
        }
        return true;
    }

    private Node<T> findMax(Node<T> root) {
        Node<T> maxNode = root;
        while(maxNode.rightChild != null) {
            maxNode = maxNode.rightChild;
        }
        return maxNode;
    }

    private Node<T> findMin(Node<T> root) {
        if(root.leftChild != null)
            return findMin(root.leftChild);
        return root;
    }

    private Node<T> insert(T element, Node<T> root) {
        if(root == null)
            return new Node<>(element);
        int cmpResult = element.compareTo(root.element);
        if(cmpResult > 0) {
            root.rightChild = insert(element, root.rightChild);
        } else if(cmpResult < 0) {
            root.leftChild = insert(element, root.leftChild);
        }
        return root;
    }

    private Node<T> remove(T element, Node<T> root) {
        if(root == null) {
            return null;
        }

        int cmpResult = element.compareTo(root.element);

        if(cmpResult > 0) {
            root.rightChild = remove(element, root.rightChild);
        } else if(cmpResult < 0) {
            root.leftChild = remove(element, root.leftChild);
        } else if(root.leftChild != null && root.rightChild != null) {

            // 找到右子树中的最小节点，把值赋值给待删除节点
            Node<T> minNodeOfRightChild = findMin(root.rightChild);
            root.element = minNodeOfRightChild.element;

            // 把右子树中的最小节点删除，右子树的最小节点一定没有左孩子
            root.rightChild = remove(minNodeOfRightChild.element, root.rightChild);
        } else {
            root = root.leftChild != null ? root.leftChild : root.rightChild;
        }
        return root;
    }

    private void printTree(Node<T> root) {
        System.out.println(root.element);
        if(root.leftChild != null) {
            printTree(root.leftChild);
        }
        if(root.rightChild != null) {
            printTree(root.rightChild);
        }
    }
}

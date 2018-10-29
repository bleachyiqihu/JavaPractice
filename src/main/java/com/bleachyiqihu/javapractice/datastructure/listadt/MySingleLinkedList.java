package com.bleachyiqihu.javapractice.datastructure.listadt;

import java.util.ConcurrentModificationException;
import java.util.Iterator;


/**
 * Created by Paul on 2017-11-11
 */
public class MySingleLinkedList<T> implements Iterable<T> {

    private Node<T> beginMarker;
    private int theSize;
    private int modCount = 0;


    public MySingleLinkedList() {
        doClear();
    }

    private static class Node<T> {

        private Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        T data;
        Node<T> next;
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean add(T data) {
        Node<T> endNode;
        if (size() == 0) {
            endNode = beginMarker;
        } else {
            endNode = getNode(size() - 1);
        }
        addAfter(endNode, data);
        return true;
    }

    public boolean add(int idx, T data) {
        Node<T> node = getNode(idx);
        addAfter(node, data);
        return true;
    }

    public T get(int idx) {
        return getNode(idx).data;
    }

    public void clear() {
        doClear();
    }


    @Override
    public Iterator<T> iterator() {
        return new mySingleLinkedListIterator();
    }


    private class mySingleLinkedListIterator implements Iterator<T> {

        private int exceptedModCount = modCount;

        private boolean okToRemove = false;

        private Node<T> current = beginMarker.next;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            okToRemove = true;
            return data;
        }

        @Override
        public void remove() {
            if (!okToRemove)
                throw new IllegalStateException();
            if(modCount != exceptedModCount)
                throw new ConcurrentModificationException();
            MySingleLinkedList.this.remove(current);
            exceptedModCount++;

        }
    }

    private void doClear() {
        beginMarker = new Node<>(null, null);
        theSize = 0;
        modCount++;
    }

    private void addAfter(Node<T> data, T x) {
        data.next = new Node<>(x, data.next);
        theSize++;
        modCount++;
    }

    private Node<T> getNode(int idx) {
        if (idx > theSize - 1 || idx < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = beginMarker.next;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    private T remove(Node<T> node) {
        if (node.next == null) {
            throw new RuntimeException("nothing next to the last element.");
        }
        T data = node.next.data;
        node.next = node.next.next;
        modCount++;
        return data;
    }

}

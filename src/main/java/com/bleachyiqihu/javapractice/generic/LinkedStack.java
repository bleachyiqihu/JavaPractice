package com.bleachyiqihu.javapractice.generic;

/**
 * 链表构成的栈，栈的末端是一个哨兵
 *
 * Created by Paul on 2017/10/21
 */
public class LinkedStack<T> {
    private Node top = new Node();

    private class Node {
        T item;
        Node next;

        boolean end() {
            return item == null && next == null;
        }

        public Node() {
            item = null;
            next = null;
        }

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    void push(T item) {
        top = new Node(item, top);
    }

    T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        for (String s : "Nice to me U".split(" ")) {
            stack.push(s);
        }
        String s;
        while ((s = stack.pop()) != null) {
            System.out.println(s);
        }
    }
}

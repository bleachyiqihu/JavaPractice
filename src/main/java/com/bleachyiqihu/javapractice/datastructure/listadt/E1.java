package com.bleachyiqihu.javapractice.datastructure.listadt;

import java.util.*;

/**
 * Created by Paul on 2017-11-11
 */
public class E1 {
    private Collection<Integer> list = new ArrayList<>();
    private Collection<Integer> printIndexList = new LinkedList<>();

    private void init() {
        list = Arrays.asList(1, 2, 3, 4, 5);
        printIndexList.addAll(Arrays.asList(1, 3, 7, 9));
    }

    private void printLots(Collection<Integer> L, Collection<Integer> P) {
        Iterator<Integer> lItr = L.iterator();
        Iterator<Integer> pItr = P.iterator();
        Integer printedItem = 0;
        Integer index = 0;
        int printedIndex;
        while(pItr.hasNext() && lItr.hasNext()) {
            printedIndex = pItr.next();
            if(printedIndex >= L.size())
                break;
            System.out.println("Looking for the position: " + printedIndex);
            while(index <= printedIndex && lItr.hasNext()) {
                printedItem = lItr.next();
                index++;
            }
            System.out.println(printedItem);
        }
    }

    public static void main(String[] args) {
        E1 e1 = new E1();
        e1.init();
        e1.printLots(e1.list, e1.printIndexList);
    }
}

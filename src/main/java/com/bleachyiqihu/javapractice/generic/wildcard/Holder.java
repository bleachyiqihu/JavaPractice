package com.bleachyiqihu.javapractice.generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * 关于通配符在泛型中的使用
 * <p>
 * Created by Paul on 2017/10/22
 */
public class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }


    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<>();
        Fruit f = flist.get(0);
//        flist.add(new Apple());  这个数组可以持有任何是Fruit子类的对象，所以编译器认为，
// 你把一个Apple添加到Fruit的列表中是不合法的，因为编译器也不知道真正这个列表应该持有的数据类型究竟是什么

        // 编译器允许把Apple类型交给fruit，因为他知道Apple类型是Fruit的子类，这样的做法没问题
        Holder<? extends Fruit> fruit = new Holder<>(new Apple());
//        fruit.setValue(new Apple()); 这么做就不行了，编译器认为你要给这个类型赋值是不对的，编译器最多知道
        // 能持有的是Fruit的子类，但是究竟已经持有什么类型了，编译器是不清楚的
        fruit.equals(new Apple());  // 这个OK，因为这个函数接受Object方法

        List<? super Fruit> flist2 = new ArrayList<>();
        flist2.add(new Apple());
//         Fruit f2 = flist2.get(0);

    }
}

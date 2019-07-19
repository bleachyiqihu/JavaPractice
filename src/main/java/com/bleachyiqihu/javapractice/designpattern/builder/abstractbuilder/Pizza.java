package com.bleachyiqihu.javapractice.designpattern.builder.abstractbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @Author wuguan
 * @Date 2019/7/14 20:12
 **/
abstract class Pizza {
    private enum Topping {PEPPER, ONION}

    private Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        Builder addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract T self();

        abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }
}

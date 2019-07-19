package com.bleachyiqihu.javapractice.designpattern.builder.abstractbuilder;

import java.util.Objects;

/**
 * @Author wuguan
 * @Date 2019/7/14 20:23
 **/
class NyPizza extends Pizza {

    private enum Size {BIG, MID}

    private final Size size;

    static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Builder self() {
            return this;
        }

        @Override
        NyPizza build() {
            return new NyPizza(this);
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}

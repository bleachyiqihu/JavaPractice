package com.bleachyiqihu.javapractice.designpattern.builder.normal;

/**
 * @Author wuguan
 * @Date 2019/7/14 10:50
 **/
public class Instance {
    private String attr1;
    private String attr2;

    private Instance(String attr1, String attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    public static class Builder {
        private String attr1;
        private String attr2;

        public Builder attr1(String attr1) {
            this.attr1 = attr1;
            return this;
        }

        public Builder attr2(String attr2) {
            this.attr2 = attr2;
            return this;
        }

        public Instance build() {
            return new Instance(this.attr1, this.attr2);
        }
    }
}

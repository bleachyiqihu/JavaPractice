package com.bleachyiqihu.javapractice.designpattern.chain.arraychain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:47
 **/
public class MyFilterChain implements FilterChain {

    private Filter[] filters;
    private int pos;
    private int n;
    private int size;

    MyFilterChain() {
        filters = new Filter[10];
        n = 0;
        pos = 0;
        size = 10;
    }

    public void addFilter(Filter filter) {
        if (size > 0) {
            filters[n++] = filter;
        } else {
            throw new RuntimeException("Full filter array");
        }
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (pos < n) {
            Filter filter = filters[pos++];
            if (filter != null) {
                filter.doFilter(request, response, this);
            }
        }
    }
}

package com.bleachyiqihu.javapractice.designpattern.chain.arraychain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:45
 **/
interface FilterChain {
    void doFilter(Request request, Response response);

    void addFilter(Filter filter);
}

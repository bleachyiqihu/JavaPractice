package com.bleachyiqihu.javapractice.designpattern.chain.arraychain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:42
 **/
interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}

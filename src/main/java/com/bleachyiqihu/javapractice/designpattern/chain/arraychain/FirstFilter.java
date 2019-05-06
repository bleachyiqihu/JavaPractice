package com.bleachyiqihu.javapractice.designpattern.chain.arraychain;

/**
 * @Author wuguan
 * @Date 2019/5/6 14:05
 **/
public class FirstFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        response.setResult(response.getResult() + " append by first filter");
        filterChain.doFilter(request, response);
    }
}

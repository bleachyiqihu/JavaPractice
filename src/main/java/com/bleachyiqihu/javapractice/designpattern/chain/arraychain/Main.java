package com.bleachyiqihu.javapractice.designpattern.chain.arraychain;

/**
 * @Author wuguan
 * @Date 2019/5/6 14:23
 **/
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        response.setResult("my response");
        FilterChain filterChain = new MyFilterChain();
        filterChain.addFilter(new FirstFilter());
        filterChain.doFilter(request, response);
        System.out.println(response.getResult());
    }
}

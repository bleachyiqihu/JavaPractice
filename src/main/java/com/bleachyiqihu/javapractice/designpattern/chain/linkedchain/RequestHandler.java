package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:21
 **/
abstract class RequestHandler {

    private RequestHandler next;

     RequestHandler(RequestHandler next) {
        this.next = next;
    }

    void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }

    void printReq(Request request, RequestHandler requestHandler) {
        System.out.println(requestHandler.getClass().getName() + ":" + request.getDesc());
    }

}

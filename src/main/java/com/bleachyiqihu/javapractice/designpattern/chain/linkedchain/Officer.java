package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:28
 **/
class Officer extends RequestHandler {

    Officer(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.A) {
            printReq(request, this);
        } else {
            System.out.println(this.getClass().getName() + ": none of my business");
        }
        super.handleRequest(request);
    }
}

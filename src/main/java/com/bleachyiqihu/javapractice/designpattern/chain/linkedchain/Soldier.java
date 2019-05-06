package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:29
 **/
class Soldier extends RequestHandler {
    Soldier(RequestHandler next) {
        super(next);
    }

    @Override
    void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.B) {
            printReq(request, this);
        } else {
            System.out.println(this.getClass().getName() + ": none of my business");
        }
        super.handleRequest(request);
    }
}

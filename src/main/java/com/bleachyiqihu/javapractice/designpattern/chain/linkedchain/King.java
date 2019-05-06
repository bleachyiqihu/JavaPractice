package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:28
 **/
class King {

    private RequestHandler chain;

    private void buildChain() {
        this.chain = new Officer(new Soldier(null));
    }

    void makeReq(Request request) {
        if (chain == null) {
            buildChain();
        }
        chain.handleRequest(request);
    }

}

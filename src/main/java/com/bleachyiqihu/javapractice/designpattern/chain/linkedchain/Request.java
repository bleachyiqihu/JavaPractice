package com.bleachyiqihu.javapractice.designpattern.chain.linkedchain;

/**
 * @Author wuguan
 * @Date 2019/5/6 11:25
 **/
class Request {
    private RequestType requestType;

    private String desc;

    Request(RequestType requestType, String desc) {
        this.requestType = requestType;
        this.desc = desc;
    }

    RequestType getRequestType() {
        return requestType;
    }


    String getDesc() {
        return desc;
    }

}

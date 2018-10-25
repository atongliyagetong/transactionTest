package com.chen.transaction.demo4;

/**
 * Created by Chen on 2018/6/16.
 */
public interface TransferService {

    void transfer(String out, String in, String money);

    void transfer1( String out,  String money);

    void transfer2( String in,  String money);

}

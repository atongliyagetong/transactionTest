package com.chen.transaction.demo3;

/**
 * Created by Chen on 2018/6/16.
 */
public interface TransferService {

    public void transfer(String out, String in, String money) throws Exception;
}

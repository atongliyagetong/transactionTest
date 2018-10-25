package com.chen.transaction.demo3;

/**
 * Created by Chen on 2018/6/17.
 */
public interface AccountDao {
    /**
     * 转出
     * @param out 转出账号
     * @param money 转出金额
     */
    void outMoney(String out, String money);

    /**
     * 转入
     * @param in 转入账号
     * @param money 转入金额
     */
    void inMoney(String in, String money);

    /**
     * 写入log
     * @param info
     */
    void insertLog(String info);
}

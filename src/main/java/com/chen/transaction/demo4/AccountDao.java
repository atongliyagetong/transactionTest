package com.chen.transaction.demo4;

/**
 * Created by Chen on 2018/6/17.
 */
public interface AccountDao {
    /**
     * ת��
     * @param out ת���˺�
     * @param money ת�����
     */
    void outMoney(String out, String money);

    /**
     * ת��
     * @param in ת���˺�
     * @param money ת����
     */
    void inMoney(String in, String money);


    /**
     * ��Ǯ
     * @param in ת���˺�
     * @param money ת����
     */
    void addMoney(String in, String money);
}

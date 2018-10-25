package com.chen.transaction.demo3;

/**
 * Created by Chen on 2018/6/16.
 */
public class TransferServiceImpl implements TransferService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(final String out, final String in, final String money) throws Exception{
        try {
            accountDao.outMoney(out, money);
            accountDao.insertLog("≤Â»Î ˝æ›");
            accountDao.inMoney(in, money);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}



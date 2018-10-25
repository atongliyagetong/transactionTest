package com.chen.transaction.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chen on 2018/6/16.
 */
public class TransferServiceImpl implements TransferService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void transfer(final String out, final String in, final String money) {
        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);

    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void transfer1(final String out, final String money) {
        accountDao.outMoney(out, money);
//        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED, rollbackFor = Exception.class)
    public void transfer2( final String in, final String money) {
        accountDao.inMoney(in, money);
        throw new RuntimeException();
    }


}



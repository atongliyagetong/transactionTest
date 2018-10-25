package com.chen.transaction.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Chen on 2018/8/12.
 */
public class AddServiceImpl implements AddService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addMoney(String no, String money) {
        accountDao.inMoney(no, money);
        throw new RuntimeException();
    }
}

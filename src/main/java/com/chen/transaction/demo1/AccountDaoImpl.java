package com.chen.transaction.demo1;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Chen on 2018/6/17.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

    private Logger logger = Logger.getLogger(this.getClass());

    public void outMoney(String out, String money) {
        logger.info(out + "转帐转出" + money);
        JdbcTemplate jdbcTemplate = this.getJdbcTemplate();
        String sql = "update account set money=money-? where name=?";
        outPutSql(sql, out, money);
        jdbcTemplate.update(sql, money, out);
    }

    public void inMoney(String in, String money) {
        logger.info(in + "转帐转入" + money);
        String sql = "update account set money=money+? where name=?";
        outPutSql(sql, in, money);
        this.getJdbcTemplate().update(sql, money, in);
    }

    private void outPutSql(String sql,String... args) {
        class Count { // 统计问号的个数
            public int countQ(String sql) {
                int count = 0;
                for (int i = 0; i < sql.length(); i++) {
                    if (sql.charAt(i) == '?') {
                        count++;
                    }
                }
                return count;
            }
        }
        //问号个数
        int count = new Count().countQ(sql);
        if (count != args.length) {
            System.out.println("？个数和参数个数不符合");
            return;
        }else{
            for (int i = 0; i < args.length && sql.indexOf("?") > -1; i++) {
                sql = sql.replaceFirst("\\?", args[i]);
            }
            System.out.println("Debug sql:" + sql);
        }
    }
}

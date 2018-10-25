import com.chen.transaction.demo1.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Chen on 2018/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:*.xml")
public class TestDemo1 {

    @Resource(name = "transferService")
    private TransferService transferService;


    @Test
    public void testNoTransaction() {
        transferService.transfer("aaa", "bbb", "100");
    }


    @Test
    public void testString() {
        String[] params = {"911", "1100"};
        String sql = "select * from xt_ck where wlbm=? and gcbm=?";
        sql = sql.replaceFirst("\\?", params[0]);
        sql = sql.replaceFirst("\\?", params[1]);
        System.out.println(sql);
    }

}

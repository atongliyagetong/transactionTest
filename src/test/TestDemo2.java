import com.chen.transaction.demo2.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Chen on 2018/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class TestDemo2 {

    @Resource(name = "transactionProxy")
    private TransferService transferService2;


    @Test
    public void testDemo2() {
        transferService2.transfer("aaa", "bbb", "100");
    }



}

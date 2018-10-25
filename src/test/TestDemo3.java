import com.chen.transaction.demo3.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 使用aop的方式自动代理
 * Created by Chen on 2018/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class TestDemo3 {

    @Resource(name = "transferService3")
    private TransferService transferService3;


    @Test
    public void testDemo3() {
        try {
            transferService3.transfer("aaa", "bbb", "100");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

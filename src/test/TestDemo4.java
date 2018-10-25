import com.chen.transaction.demo4.TransferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Chen on 2018/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class TestDemo4 {

    @Resource(name = "transferService4")
    private TransferService transferService;


    @Test
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void testNoTransaction() {
//        transferService.transfer("aaa", "bbb", "100");
        try {
            transferService.transfer1("aaa", "100");
            transferService.transfer2("bbb", "100");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Test
    public void testIntege(){
        Integer a1 = 127;
        Integer a2 = 127;
        System.out.println(a1 == a2);
        Integer b1 = 128;
        Integer b2 = 128;
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1==128);
    }
}
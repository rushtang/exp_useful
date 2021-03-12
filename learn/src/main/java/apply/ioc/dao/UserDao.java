package apply.ioc.dao;

import apply.ioc.core.BeanFactory;
import apply.ioc.model.BatchSms;

/**
 * @author tangmaoheng
 * @createTime 2019年12月12日 20:06:00
 */
public class UserDao {

    public void save() {
        BatchSms batchSms = BeanFactory.getBean(BatchSms.class);
        System.out.println(batchSms.toString());
        System.out.println("------start--------");
        System.out.println("this is UserDao...");
        System.out.println("i'm saving........");
        System.out.println("-------end---------");
    }
}

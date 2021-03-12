package apply.ioc.service;

import apply.ioc.annotation.Inject;
import apply.ioc.dao.ClassDao;
import apply.ioc.dao.UserDao;

/**
 * @author tangmaoheng
 * @createTime 2019年12月12日 20:07:00
 */
public class UserService {
    @Inject
    private UserDao userDao;

    @Inject
    private ClassDao classDao;

    public void save() {
        System.out.println("service *****");
        userDao.save();
        classDao.save();
    }

}

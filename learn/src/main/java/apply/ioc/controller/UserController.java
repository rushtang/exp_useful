package apply.ioc.controller;

import apply.ioc.annotation.Inject;
import apply.ioc.service.UserService;

/**
 * @author tangmaoheng
 * @createTime 2019年12月12日 20:08:00
 */

public class UserController {
    @Inject
    private UserService userService;

    public void save() {
        userService.save();
    }

}

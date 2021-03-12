package com.tmh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tangmaoheng
 * @createTime 2019年12月23日 17:03:00
 */
@Service
public class HelloService {
    @Autowired
    private HelloProperties helloProperties;

    /**
     * 打招呼方法
     *
     * @param name 人名，向谁打招呼使用
     * @return
     */
    public String sayHello(String name) {
        String new_name=name+"test";

        return "Hello " + new_name + " " + helloProperties.getMsg();
    }
}

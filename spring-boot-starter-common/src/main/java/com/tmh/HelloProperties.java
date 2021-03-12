package com.tmh;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tangmaoheng
 * @createTime 2019年12月23日 17:01:00
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    /**
     * 打招呼的内容，默认为“World!”
     */
    private String msg = "World!";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

package com.tmh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 10:27:00
 */

@Configuration
@ConfigurationProperties(prefix = "demo")
public class DemoConfig {

    private String name;
    private String note;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}

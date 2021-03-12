package com.tmh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 10:27:00
 */


@Data
@Configuration
@PropertySource(value="classpath:application.properties")
@ConfigurationProperties(prefix = "demo")
public class DemoPropertiesConfig {

    private String name;
    private String note;
    private String content;


}

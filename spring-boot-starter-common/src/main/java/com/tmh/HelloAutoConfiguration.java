package com.tmh;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author tangmaoheng
 * @createTime 2019年12月23日 17:04:00
 */
//定义为配置类
@Configuration
//在web工程条件下成立
@ConditionalOnWebApplication
//启用HelloProperties配置功能，并加入到IOC容器中
@EnableConfigurationProperties({HelloProperties.class})
//导入HelloService组件
@Import(HelloService.class)
//@ComponentScan
public class HelloAutoConfiguration {

}
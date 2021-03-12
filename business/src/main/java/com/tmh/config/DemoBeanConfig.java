package com.tmh.config;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 10:33:00
 */

@Data
@Configuration
@Log4j2
public class DemoBeanConfig {

    @Value("${demo_bean.name}")
    private String name;

    @Value("${demo_bean.example}")
    private String example;

    @Bean
    Tool createTool(){
        log.info("createTool +++\n");
        return new Tool(getName(),getExample());
    }



}

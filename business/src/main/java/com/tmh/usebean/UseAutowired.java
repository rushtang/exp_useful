package com.tmh.usebean;

import com.tmh.config.DemoBeanConfig;
import com.tmh.config.DemoConfig;
import com.tmh.config.DemoPropertiesConfig;
import com.tmh.config.Tool;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 11:01:00
 * bean的使用
 */



@Log4j2
@Component
public class UseAutowired implements InitializingBean {

    @Autowired
    DemoBeanConfig demoBeanConfig;

    private DemoConfig demoConfig;

    private DemoPropertiesConfig demoPropertiesConfig;

    @Autowired
    ApplicationContext applicationContext;

//    @Autowired
//    Tool tool;


    //构造方法注入，如果一个bean 只有一个构造函数，则可以省略@Autowired
//    @Autowired
    public UseAutowired(DemoConfig demoConfig) {
        log.info("\n 构造注入demoConfig \n ");
        this.demoConfig=demoConfig;
    }

    @Autowired
    public void setDemoPropertiesConfig(DemoPropertiesConfig demoPropertiesConfig) {
        log.info("\n setter注入 demoPropertiesConfig\n  \n ");
        this.demoPropertiesConfig = demoPropertiesConfig;
    }

    //执行顺序 Constructor构造方法 > @Autowired > @PostConstruct > InitializingBean接口实现方法
    @PostConstruct
    private void init(){
        log.info("\n 依赖bean全部注入后执行———— demoBeanConfigName:  "+demoBeanConfig.getName());
    }

    //InitializingBean接口的实现方法
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("\n 在PostConstruct后执行———— demoBeanConfigName:  "+demoBeanConfig.getExample());
    }

    public Tool get(){
        Tool tool = applicationContext.getBean(Tool.class);

        return tool;

    }


}

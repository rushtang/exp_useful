package com.tmh.bean;

import com.tmh.config.Tmp;
import com.tmh.config.Tool;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 15:21:00
 */


@Component
@Slf4j
@Data
public class TmpBean {


    private  String name;

    //注解@bean修饰的方法形参可以直接注入依赖的bean  (等价于构造器注入)
    @Bean
    Tmp createTmp(Tool tool){
        Tmp tmp = new Tmp();
        tmp.setName(tool.getName());
        tmp.setText(tool.getText());
        log.info("\n创建tmp\n");
        return tmp;
    }



}
